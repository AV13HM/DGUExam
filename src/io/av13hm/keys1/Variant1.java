package io.av13hm.keys1;

import java.util.HashMap;
import java.util.Scanner;

public class Variant1 {
    public static HashMap<String, Integer> ways = new HashMap<>(){{
        put("Назрань", 249);
        put("Нальчик", 364);
        put("Владикавказ", 274);
        put("Грозный", 168);
        put("Черкесск", 546);
    }};

    public static HashMap<String, Integer> participants = new HashMap<>(){{
        put("Назрань", 0);
        put("Нальчик", 0);
        put("Владикавказ", 0);
        put("Грозный", 0);
        put("Черкесск", 0);
    }};

    public static HashMap<String, Integer> waysCosts = new HashMap<>(){{
        put("Назрань", 0);
        put("Нальчик", 0);
        put("Владикавказ", 0);
        put("Грозный", 0);
        put("Черкесск", 0);
    }};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (String key : ways.keySet()) {
            System.out.printf("Количество участников команды из %s - ", key);
            participants.put(key, sc.nextInt());
        }
        sc.close();

        for (String key : ways.keySet()) {
            waysCosts.put(key, ways.get(key)*(participants.get(key)*2));
        }

        System.out.println("\nТаблица:");

        for (String key : ways.keySet()) {
            System.out.printf("Команда: %s; Расстояние: %s; Количество участников: %s; Стоимость поездки: %s;\n", key , ways.get(key), participants.get(key), waysCosts.get(key));
        }
    }
}
