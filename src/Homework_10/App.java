package Homework_10;

import java.util.ArrayList;
import java.util.Iterator;

public class App {

    public static ArrayList<Student> removeWeakStudents(ArrayList<Student> students) {
        ArrayList<Student> passedstudents = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getMeangrade() >= 3) {
                passedstudents.add(students.get(i));
            }
        }
        return passedstudents;
    }

    public static void printStudents(ArrayList<Student> students) {
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().getName());
        }
    }

    public static void printStudents(ArrayList<Student> students, int course) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCourse() == course) {
                System.out.println(students.get(i).getName());
            }
        }
    }


    public static void main(String[] args) {
        Student s1 = new Student("Иванов", 1, 2, 5, 7, 3);
        Student s2 = new Student("Петров", 2, 3, 8, 9, 7);
        Student s3 = new Student("Соколов", 3, 4, 2, 2, 3);
        Student s4 = new Student("Орлов", 5, 2, 5, 8, 6);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        System.out.println("Полный список студентов:");
        printStudents(students);
        System.out.println();
        System.out.println("На следующий курс переходят:");
        printStudents(removeWeakStudents(students));
        System.out.println();
        System.out.println("На указанном курсе обучаются:");
        printStudents(students, 2);

    }
}
