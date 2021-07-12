package Homework_8;

public abstract class Figures {
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

    public abstract double findPerim();

    public abstract double findArea();
}
