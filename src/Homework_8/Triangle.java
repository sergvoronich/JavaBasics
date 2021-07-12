package Homework_8;

public class Triangle extends Figures {
    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double findPerim() {
        return side1 + side2 + side3;
    }

    public double findArea() {
        double hp = (double) findPerim() / 2;
        double a = hp * (hp - side1) * (hp - side2) * (hp - side3);
        double area = Math.sqrt(a);
        return area;
    }

    protected void displayInfo() {
        super.displayInfo();
        System.out.println("Стороны треугольника = " + side1 + ", " + side2 + ", " + side3);
    }
}
