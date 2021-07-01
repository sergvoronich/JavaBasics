package Homework_6;

import java.util.Random;

public class Arrays {
    public static void valueMoreThanInd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void rowAndColPrint(int[][] array, int k, int p) {
        for (int i = 0; i < array.length; i++) {
            if (i == k) {
                for (int j = 0; j < array[0].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (j == p) {
                    System.out.println(array[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        valueMoreThanInd(array);
        System.out.println();

        int row = 3;
        int column = 2;
        int[][] array2 = new int[5][6];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                array2[i][j] = rand.nextInt(100);
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        rowAndColPrint(array2, row, column);
    }
}
