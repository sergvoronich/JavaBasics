package Homework_7;

public class Bankomat {
    private int bill20;
    private int bill50;
    private int bill100;

    public int getSum20() {
        return getBill20() * 20;
    }

    public int getSum50() {
        return getBill50() * 50;
    }

    public int getSum100() {
        return getBill100() * 100;
    }

    public int getTotalSum() {
        return getBill20() * 20 + getBill50() * 50 + getBill100() * 100;
    }

    public void printInfo() {
        System.out.println();
        System.out.println("Количество купюр номиналом 20 = " + getBill20());
        System.out.println("Количество купюр номиналом 50 = " + getBill50());
        System.out.println("Количество купюр номиналом 100 = " + getBill100());
        System.out.println("Сумма купюрами номиналом 20 = " + getSum20());
        System.out.println("Сумма купюрами номиналом 50 = " + getSum50());
        System.out.println("Сумма купюрами номиналом 100 = " + getSum100());
        System.out.println("Общая сумма в банкомате = " + getTotalSum());
        System.out.println();
    }

    public Bankomat(int bill20, int bill50, int bill100) {
        this.bill20 = bill20;
        this.bill50 = bill50;
        this.bill100 = bill100;
    }

    public int getBill20() {
        return bill20;
    }

    public void setBill20(int bill20) {
        this.bill20 = bill20;
    }

    public int getBill50() {
        return bill50;
    }

    public void setBill50(int bill50) {
        this.bill50 = bill50;
    }

    public int getBill100() {
        return bill100;
    }

    public void setBill100(int bill100) {
        this.bill100 = bill100;
    }
}
