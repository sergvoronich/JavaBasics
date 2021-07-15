package Homework_10;

public class Student {
    private String name;
    private int group;
    private int course;
    private int grade1;
    private int grade2;
    private int grade3;
    double meangrade;

    public double getMeangrade() {
        return meangrade;
    }

    public Student(String name, int group, int course, int grade1, int grade2, int grade3) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        meangrade = (double) (grade1 + grade2 + grade3) / 3;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }
}

