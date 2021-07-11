package Homework_8;

public class Triangle extends Figures {
    protected int side1;
    protected int side2;
    protected int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    protected int findPerim() {
        return side1 + side2 + side3;
    }

    protected int findArea() {
        double hp = (double) findPerim() / 2;
        double a = hp * (hp - side1) * (hp - side2) * (hp - side3);
        double area = Math.sqrt(a);
        return (int) Math.round(area);
    }

    protected void displayInfo() {
        super.displayInfo();
        System.out.println("Стороны треугольника = " + side1 + ", " + side2 + ", " + side3);
    }
}
