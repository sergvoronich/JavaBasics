package Homework_8;

public class Square extends Quadrangle {
    public Square(double side) {
        length = side;
        width = side;
    }

    protected void displayInfo() {
        System.out.println("Название фигуры: " + getName());
        System.out.println("Сторона квадрата = " + length);
    }

}
