package Homework_8;

public class Circle extends Figures {
    protected int circleperim;

    public Circle(int l) {
        circleperim = l;
    }

    protected double findDiam() {
        return circleperim / 3.14;
    }

    protected void displayInfo() {
        super.displayInfo();
        System.out.println("Периметр окружности = " + circleperim);
    }
}
