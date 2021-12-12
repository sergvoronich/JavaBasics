package Homework_13;

public class AppForThread {

    public static void main(String[] args) {

        new MyThread("Поток 1").start();
        new MyThread("Поток 2").start();
        new MyThread("Поток 3").start();
        new MyThread("Поток 4").start();
        new MyThread("Поток 5").start();
        new MyThread("Поток 6").start();
        new MyThread("Поток 7").start();
        new MyThread("Поток 8").start();
        new MyThread("Поток 9").start();
        new MyThread("Поток 10").start();



    }

}
