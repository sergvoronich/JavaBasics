package Homework_8;

public class Application {

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(5, 10);
        rect1.setName("Прямоугольник №1");
        rect1.displayInfo();
        System.out.println("Периметр фигуры = " + rect1.findPerim());
        System.out.println("Площадь фигуры = " + rect1.findArea());
        System.out.println();

        Square square1 = new Square(7);
        square1.setName("Квадрат №1");
        square1.displayInfo();
        System.out.println("Периметр фигуры = " + square1.findPerim());
        System.out.println("Площадь фигуры = " + square1.findArea());
        System.out.println();

        Circle circle1 = new Circle(25);
        circle1.setName("Круг №1");
        circle1.displayInfo();
        System.out.println("Диаметр фигуры = " + Math.round(circle1.findDiam()));
        System.out.println();

        Triangle triangle1 = new Triangle(5, 7, 9);
        triangle1.setName("Треугольник №1");
        triangle1.displayInfo();
        System.out.println("Периметр фигуры = " + triangle1.findPerim());
        System.out.println("Площадь фигуры = " + triangle1.findArea());

    }
}
