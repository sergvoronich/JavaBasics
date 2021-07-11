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

    protected int findPerim() {
        return 0;
    }

    protected int findArea() {
        return 0;
    }
}
