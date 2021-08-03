package Homework_14;

public class Consumer extends Thread {

    MyQueue queue;

    public Consumer(MyQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5000; i++) {
            queue.get();
        }
    }

}
