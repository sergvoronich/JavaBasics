package Homework_14;

public class Application {

    public static void main(String[] args) {

        PrintThreadName print = new PrintThreadName();

        new NewThread(print).start();
        new NewThread(print).start();
        new NewThread(print).start();
        new NewThread(print).start();
        new NewThread(print).start();
        new NewThread(print).start();
        new NewThread(print).start();
        new NewThread(print).start();
        new NewThread(print).start();
        new NewThread(print).start();

    }
}
