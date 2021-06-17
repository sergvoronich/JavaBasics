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

    public static int sum1(int a, int b) {
        return a + b;
    }

    public static double sum2(double a, double b, double c) {
        return a + b + c;
    }

    public static int rand(int a, int b) {
        Random rand = new Random();
        return rand.nextInt(b-a+1) + a;
    }

    public static void main(String[] args) {
        int square = square(enterIntNumber());
        System.out.print("Квадрат введенного числа = ");
        System.out.println(square);
        System.out.println(sum1(enterIntNumber(), enterIntNumber()));
        System.out.println(sum2(enterFractNumber(), enterFractNumber(), enterFractNumber()));
        String str = enterUsername();
        System.out.println("Имя пользователя: " + str);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите минимальное значение: ");
        int min = sc.nextInt();
        System.out.println("Введите максимальное значение: ");
        int max = sc.nextInt();
        System.out.println("Случайное число в заданном диапазоне: " + rand(min,max));
    }
}
