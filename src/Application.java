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
        boolean res = a % 2 == 0;
        return res;
    }

    public static int sumOfNumbers(int num) {
        int sum = 0;
        if (num < 1) {
            System.out.println("Число должно быть больше нуля");
            return sum;
        }
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        int fact = 1;
        if (n == 1 || n == 0) {
            return fact;
        }
        if (n <= 0) {
            System.out.println("Число должно быть больше нуля");
            return 0;
        }
        fact = n * factorial(n - 1);
        return fact;
    }

    public static String dayOfWeekName() {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String name = "";
        switch (dayOfWeek) {
            case 2:
                name = "понедельник";
                break;
            case 3:
                name = "вторник";
                break;
            case 4:
                name = "среда";
                break;
            case 5:
                name = "четверг";
                break;
            case 6:
                name = "пятница";
                break;
            case 7:
                name = "суббота";
                break;
            case 1:
                name = "воскресенье";
                break;
        }
        return name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println();
            System.out.println("Выберите вызываемый метод, для этого введите цифру от 1 до 7: ");
            System.out.println("1 - Возведение целого числа в квадрат, 2 - Расчет среднего арифметического двух целых чисел");
            System.out.println("3 - Расчет среднего арифметического трех дробных чисел, 4 - Генерирование случайного " +
                    "целого числа в заданном диапазоне");
            System.out.println("5 - Проверка, является ли число четным, 6 - Вывод названия текущего дня недели");
            System.out.println("7 - Расчет суммы чисел от 1 до введенного числа, 8 - Расчет факториала числа");
            System.out.println("0 - Завершение программы");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Квадрат введенного числа = " + square(enterIntNumber()));
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
                    break;
                case 7:
                    System.out.println("Сумма чисел от 1 до введенного числа = " + sumOfNumbers(enterIntNumber()));
                    break;
                case 8:
                    System.out.println("Факториал введенного числа = " + factorial(enterIntNumber()));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Операции с таким номером не существует");
            }
        } while (choice != 0);
        System.out.println("Вы ввели 0, выполнение программы завершено!");
    }
}