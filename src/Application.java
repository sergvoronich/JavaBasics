import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static int enterIntNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        return sc.nextInt();
    }

    public static double enterFractNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        return sc.nextDouble();
    }

    public static String enterUsername() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        return sc.nextLine();
    }

    public static int square(int a) {
        return a * a;
    }

    public static double mean(int a, int b) {
        return (double) (a + b) / 2;
    }

    public static double mean(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static int rand(int a, int b) {
        Random rand = new Random();
        return rand.nextInt(b - a + 1) + a;
    }

    public static boolean evenCheck(int a) {
        boolean res = false;
        if (a % 2 == 0) {
            res = true;
        }
        return res;
    }

    public static String dayOfWeekName() {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String name = "";
        switch (dayOfWeek) {
            case 1:
                name = "понедельник";
                break;
            case 2:
                name = "вторник";
                break;
            case 3:
                name = "среда";
                break;
            case 4:
                name = "четверг";
                break;
            case 5:
                name = "пятница";
                break;
            case 6:
                name = "суббота";
                break;
            case 7:
                name = "воскресенье";
                break;
        }
        return name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите вызываемый метод, для этого введите цифру от 1 до 6: ");
        System.out.println("1 - Возведение целого числа в квадрат, 2 - Расчет среднего арифметического двух целых чисел");
        System.out.println("3 - Расчет среднего арифметического трех дробных чисел, 4 - Генерирование случайного " +
                "целого числа в заданном диапазоне");
        System.out.println("5 - Проверка, является ли число четным, 6 - Вывод названия текущего дня недели");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Квадрат введенного числа = " + square(enterIntNumber()));
                break;
            case 2:
                System.out.println("Среднее арифметическое введенных чисел = " + mean(enterIntNumber(), enterIntNumber()));
                break;
            case 3:
                System.out.println("Среднее арифметическое введенных чисел " +
                        "= " + mean(enterFractNumber(), enterFractNumber(), enterFractNumber()));
                break;
            case 4:
                System.out.println("Введите минимальное значение: ");
                int min = sc.nextInt();
                System.out.println("Введите максимальное значение: ");
                int max = sc.nextInt();
                System.out.println("Случайное число в заданном диапазоне: " + rand(min, max));
                break;
            case 5:
                if (evenCheck(enterIntNumber())) {
                    System.out.println("Введенное число является четным");
                } else {
                    System.out.println("Введенное число является нечетным");
                }
                break;
            case 6:
                System.out.println("Текущий день недели: " + dayOfWeekName());
        }
    }
}
