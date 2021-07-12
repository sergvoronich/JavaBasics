package Homework_8;

public class Circle extends Figures {
    protected double circleperim;

    public Circle(double l) {
        circleperim = l;
    }

    public double findDiam() {
        return circleperim / 3.14;
    }

    public double findPerim() {
        return 0;
    }

    public double findArea() {
        return 0;
    }

    protected void displayInfo() {
        super.displayInfo();
        System.out.println("Периметр окружности = " + circleperim);
    }
}
