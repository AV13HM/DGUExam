package io.av13hm.keys2;

import java.util.Random;

public class Variant1 {
    public static int[] graduates = new int[50];
    public static int[] countedTable = new int[6];
    public static float middle = 0;
    public static float moda = 0;

    public static void main(String[] args) {
        randomArray(graduates);

        countTable(graduates, countedTable);
        middle = middleValue(countedTable);
        if (middle > 4.5){
            System.out.println("Фестиваль прошел блестяще!");
        }else if(middle>3.5){
            System.out.println("Успешно!");
        }else{
            System.out.println("Есть над чем работать");
        }
        moda = moda(countedTable);
        System.out.println("Мода фестиваля - " + moda);
    }

    public static void randomArray(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(5)+1;
        }
    }

    public static void countTable(int[] array, int[] table) {
        for(var value : array) {
            table[value]++;
        }
    }

    public static float middleValue(int[] table) {
        int total = 0;
        int count = 0;
        for (int value : table) {
            total += value*count+1;
            count++;
        }

        return (float) total / count;
    }

    public static int moda(int[] array) {
        int moda = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                moda = i;
                max = array[i];
            }
        }
        return moda;
    }
}
