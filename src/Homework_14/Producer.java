package Homework_14;


public class Producer extends Thread {
    MyQueue queue;

    public Producer(MyQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3334; i++) {
            queue.put();
        }
    }


}
