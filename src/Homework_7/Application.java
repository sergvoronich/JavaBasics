package Homework_7;

import java.util.Scanner;

public class Application {

    public static void addMoney(int bill20, int bill50, int bill100, Bankomat bankomat) {
        bankomat.setBill20(bankomat.getBill20() + bill20);
        bankomat.setBill50(bankomat.getBill50() + bill50);
        bankomat.setBill100(bankomat.getBill100() + bill100);
        int sum = bill20 * 20 + bill50 * 50 + bill100 * 100;
        System.out.println("Добавленная сумма = " + sum);
        System.out.println("Общая сумма в банкомате = " + bankomat.getTotalSum());
        System.out.println();
    }

    public static void withdrawMoney(int sum, Bankomat bankomat) {
        int col100;
        int col50;
        int col20;
        int col20a = 0;
        if(sum%100 == 60 || sum%100 == 80) {
            if (sum <= bankomat.getTotalSum()) {
                if (sum%100 <= bankomat.getSum20()) {
                    col20a = sum%100 / 20;
                    sum -= col20a * 20;
                } else {
                    sum = 999999999;
                }
            } else {
                System.out.println("В банкомате недостаточно средств!");
            }
        }

        if (sum <= bankomat.getTotalSum()) {
            if ((sum % 50) % 20 != 0) {
                System.out.println("Указанная сумма не может быть выдана, так как в " +
                        "банкомате присутствуют только купюры номиналом 20, 50 и 100");
            } else {
                if (sum <= bankomat.getSum100()) {
                    col100 = sum / 100;
                } else {
                    col100 = bankomat.getBill100();
                }
                sum -= col100 * 100;
                if (sum <= bankomat.getSum50()) {
                    col50 = sum / 50;
                } else {
                    col50 = bankomat.getBill50();
                }
                sum -= col50 * 50;
                if(sum <= bankomat.getSum20()) {
                    col20 = sum / 20 + col20a;
                    System.out.println("Операция успешно выполнена!");
                    System.out.println("Выдано " + col100 + " купюр номиналом 100, " + col50 +
                            " купюр номиналом 50 и " + col20 + " купюр номиналом 20.");
                    bankomat.setBill100(bankomat.getBill100() - col100);
                    bankomat.setBill50(bankomat.getBill50() - col50);
                    bankomat.setBill20(bankomat.getBill20() - col20);
                } else {
                    System.out.println("В банкомате недостаточно купюр номиналом 20 для выполнения операции!");
                }
            }
        } else if(sum == 999999999) {
            System.out.println("В банкомате недостаточно купюр номиналом 20 для выполнения операции!");
        } else {
                System.out.println("В банкомате недостаточно средств!");
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bankomat bankomat = new Bankomat(100, 50, 20);

        bankomat.printInfo();

        addMoney(10, 10, 10, bankomat);

        bankomat.printInfo();

        System.out.println("Введите сумму:");
        withdrawMoney(sc.nextInt(), bankomat);

    }

}
