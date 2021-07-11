package Homework_8;

public class Quadrangle extends Figures {
    protected int length;
    protected int width;

    protected int findPerim() {
        return 2 * length + 2 * width;
    }

    protected int findArea() {
        return length * width;
    }

    protected void displayInfo() {
        super.displayInfo();
        System.out.println("Длина = " + length);
        System.out.println("Ширина = " + width);
    }
}
