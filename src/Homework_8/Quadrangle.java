package Homework_8;

public class Quadrangle extends Figures {
    protected double length;
    protected double width;

    public double findPerim() {
        return 2 * length + 2 * width;
    }

    public double findArea() {
        return length * width;
    }

    protected void displayInfo() {
        super.displayInfo();
        System.out.println("Длина = " + length);
        System.out.println("Ширина = " + width);
    }
}
