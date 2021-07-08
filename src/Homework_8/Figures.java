package Homework_8;

public class Figures {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void displayInfo() {
        System.out.println("Название фигуры: " + name);
    }

}

class Quadrangle extends Figures {
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

class Rectangle extends Quadrangle {
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
}

class Square extends Quadrangle {
    public Square(int side) {
        length = side;
        width = side;
    }

    protected void displayInfo() {
        System.out.println("Название фигуры: " + getName());
        System.out.println("Сторона квадрата = " + length);
    }
}

class Circle extends Figures {
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

class Triangle extends Figures {
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
