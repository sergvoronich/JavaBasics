package Homework_14;

public class NewThread extends Thread {

    PrintThreadName print;

    NewThread(PrintThreadName print) {
        this.print = print;
    }

    public void run() {
        print.printThreadName();
    }

}

