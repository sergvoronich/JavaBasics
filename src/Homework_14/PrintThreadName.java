package Homework_14;

public class PrintThreadName {

    public synchronized void printThreadName() {
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
