package Homework_7;

import java.util.Arrays;
import java.util.Scanner;

public class Strings {

    public static void stringOperations(String input) {

        char last = input.charAt(input.length() - 1);
        System.out.println("Последний символ введенной строки: " + last);
        boolean end = input.endsWith("!!!");
        System.out.println("Введенная строка заканчивается на !!! " + end);
        boolean start = input.startsWith("I like");
        System.out.println("Введенная строка начинается с I like " + start);
        boolean contain = input.contains("Java");
        System.out.println("Введенная строка содержит Java " + contain);
        int position = input.indexOf("Java");
        System.out.println("Позиция подстроки Java = " + position);
        String replaced = input.replace('a', 'o');
        System.out.println(replaced);
        String uppercase = input.toUpperCase();
        System.out.println(uppercase);
        String lowercase = input.toLowerCase();
        System.out.println(lowercase);
        String cut = input.substring(7, 11);
        System.out.println(cut);
    }

    public static void main(String[] args) {

        stringOperations("I like Java!!!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String a = sc.nextLine();
        int start = 0;
        int ind = -1;
        int counter = 0;
        for (; ; ) {
            ind = a.indexOf(',', start);
            if (ind == -1) {
                break;
            }
            start = ind + 1;
            ind = -1;
            counter++;
        }
        System.out.println("Количество запятых в введенной строке = " + counter);

        String s = "  Вроде бы получилось, если я не ошибаюсь. Хотя нужно еще раз проверить!  ";
        String s1 = s.trim();
        String[] array = s1.split("[,.;:! ]+");
        StringBuilder result = new StringBuilder();
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            char end = array[i].charAt(array[i].length() - 1);
            result = result.append(end);
        }
        System.out.println(result);

    }
}
