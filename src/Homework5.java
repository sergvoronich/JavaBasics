import java.util.Random;
import java.util.Scanner;

public class Homework5 {

    public static void ticTacToe() {
        System.out.println("Игра крестики-нолики! Два игрока вводят по очереди индекс элемента " +
                "(сначала строку, а потом столбец), чтобы сделать ход.");
        int[][] field = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        int row1, column1, row2 = -1, column2 = -1;
        int counter = 0;
        for (; ; ) {
            System.out.println("Первый игрок:");
            for (; ; ) {
                row1 = sc.nextInt();
                column1 = sc.nextInt();
                if (row1 >= 0 && row1 <= 2) {
                    if (column1 >= 0 && column1 <= 2) {
                        if (field[row1][column1] != 1 && field[row1][column1] != 2) {
                            break;
                        }
                    }
                }
                System.out.println("Вы ввели некорректное значение. Повторите ввод:");
            }
            field[row1][column1] = 1;
            counter++;
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[0].length; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }
            if (field[0][0] == 1 && field[0][0] == field[0][1] && field[0][1] == field[0][2]) {
                System.out.println("Первый игрок победил!");
                break;
            } else if (field[1][0] == 1 && field[1][0] == field[1][1] && field[1][1] == field[1][2]) {
                System.out.println("Первый игрок победил!");
                break;
            } else if (field[2][0] == 1 && field[2][0] == field[2][1] && field[2][1] == field[2][2]) {
                System.out.println("Первый игрок победил!");
                break;
            } else if (field[0][0] == 1 && field[0][0] == field[1][0] && field[1][0] == field[2][0]) {
                System.out.println("Первый игрок победил!");
                break;
            } else if (field[0][1] == 1 && field[0][1] == field[1][1] && field[1][1] == field[2][1]) {
                System.out.println("Первый игрок победил!");
                break;
            } else if (field[0][2] == 1 && field[0][2] == field[1][2] && field[1][2] == field[2][2]) {
                System.out.println("Первый игрок победил!");
                break;
            } else if (field[0][0] == 1 && field[0][0] == field[1][1] && field[1][1] == field[2][2]) {
                System.out.println("Первый игрок победил!");
                break;
            } else if (field[0][2] == 1 && field[0][2] == field[1][1] && field[1][1] == field[2][0]) {
                System.out.println("Первый игрок победил!");
                break;
            } else if (counter == 9) {
                System.out.println("Игра окончена! Ничья.");
                break;
            }
            System.out.println("Второй игрок:");
            for (; ; ) {
                row2 = sc.nextInt();
                column2 = sc.nextInt();
                if (row2 >= 0 && row2 <= 2) {
                    if (column2 >= 0 && column2 <= 2) {
                        if (field[row2][column2] != 1 && field[row2][column2] != 2) {
                            break;
                        }
                    }
                }
                System.out.println("Вы ввели некорректное значение. Повторите ввод:");
            }
            field[row2][column2] = 2;
            counter++;
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[0].length; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }
            if (field[0][0] == 2 && field[0][0] == field[0][1] && field[0][1] == field[0][2]) {
                System.out.println("Второй игрок победил!");
                break;
            } else if (field[1][0] == 2 && field[1][0] == field[1][1] && field[1][1] == field[1][2]) {
                System.out.println("Второй игрок победил!");
                break;
            } else if (field[2][0] == 2 && field[2][0] == field[2][1] && field[2][1] == field[2][2]) {
                System.out.println("Второй игрок победил!");
                break;
            } else if (field[0][0] == 2 && field[0][0] == field[1][0] && field[1][0] == field[2][0]) {
                System.out.println("Второй игрок победил!");
                break;
            } else if (field[0][1] == 2 && field[0][1] == field[1][1] && field[1][1] == field[2][1]) {
                System.out.println("Второй игрок победил!");
                break;
            } else if (field[0][2] == 2 && field[0][2] == field[1][2] && field[1][2] == field[2][2]) {
                System.out.println("Второй игрок победил!");
                break;
            } else if (field[0][0] == 2 && field[0][0] == field[1][1] && field[1][1] == field[2][2]) {
                System.out.println("Второй игрок победил!");
                break;
            } else if (field[0][2] == 2 && field[0][2] == field[1][1] && field[1][1] == field[2][0]) {
                System.out.println("Второй игрок победил!");
                break;
            } else if (counter == 9) {
                System.out.println("Игра окончена! Ничья.");
                break;
            }
        }
    }

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
        System.out.println();

        ticTacToe();
    }
}
