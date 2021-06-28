import java.util.Random;
import java.util.Scanner;

public class Homework5 {

        public static void main(String[] args) {
            Random rand = new Random();

            String[] daysOfWeekArray = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
            System.out.println("Значение последнего элемента массива daysOfWeekArray: " + daysOfWeekArray[6]);
            System.out.println();

            int[] array = new int[14];
            int sum = 0;
            System.out.println("Произвольный массив array:");
            for (int i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(10);
                System.out.print(array[i] + " ");
                sum += array[i];
            }
            double mean = (double) sum / array.length;
            System.out.println();
            System.out.println("Среднее арифметическое элементов массива = " + mean);
            System.out.println("Значения элементов массива меньше среднего:");
            for (int i = 0; i < array.length; i++) {
                if (array[i] < mean) {
                    System.out.print(array[i] + " ");
                }
            }
            System.out.println();
            int[] ar2 = new int[5];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < ar2.length - 1; i++) {
                System.out.println("Введите значение элемента массива ar2:");
                ar2[i] = sc.nextInt();
            }
            System.out.println("Начальный массив ar2:");
            for (int i = 0; i < ar2.length; i++) {
                System.out.print(ar2[i] + " ");
            }
            System.out.println();
            System.out.println("Введите значение оставшегося элемента массива ar2:");
            int num = sc.nextInt();
            System.out.println("Введите индекс этого элемента:");
            int numInd = sc.nextInt();
            for (int i = ar2.length - 1; i >= 0; i--) {
                if (i > numInd) {
                    ar2[i] = ar2[i - 1];
                }
                if (i == numInd) {
                    ar2[i] = num;
                }
            }
            System.out.println("Итоговый массив ar2:");
            for (int i = 0; i < ar2.length; i++) {
                System.out.print(ar2[i] + " ");
            }
            System.out.println();
            System.out.println();
            System.out.println("Произвольный массив ar3:");
            int[][] ar3 = new int[4][5];
            int max = 0;
            for (int i = 0; i < ar3.length; i++) {
                for (int j = 0; j < ar3[0].length; j++) {
                    ar3[i][j] = rand.nextInt(90) + 10;
                    System.out.print(ar3[i][j] + " ");
                    if (ar3[i][j] > max) {
                        max = ar3[i][j];
                    }
                }
                System.out.println();
            }
            System.out.println("Максимальный элемент двумерного массива ar3 = " + max);
        }
    }
