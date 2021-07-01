package Homework_6;

import java.util.Scanner;

public class Children {
    Scanner sc = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int age;

    public void displayInfo() {
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Возраст: " + age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Children() {
        System.out.println("Введите имя ребенка: ");
        firstName = sc.nextLine();
        System.out.println("Введите фамилию ребенка: ");
        lastName = sc.nextLine();
        System.out.println("Введите возраст ребенка: ");
        age = sc.nextInt();
    }

    public Children(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args) {

        Children firstChild = new Children();

        Children secondChild = new Children("Иван", "Иванов", 12);

        System.out.println("Имя: " + firstChild.getFirstName());
        System.out.println("Фамилия: " + firstChild.getLastName());
        System.out.println("Возраст: " + firstChild.getAge());

        secondChild.displayInfo();

    }

}
