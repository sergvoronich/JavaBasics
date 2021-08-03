package Homework_14;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.Random;

public class MyQueue {

    ArrayQueue<Integer> queue;

    public MyQueue(ArrayQueue<Integer> queue) {
        this.queue = queue;
    }

    public synchronized void put() {
        Random random = new Random();
        while (queue.size() >= 100) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.add(random.nextInt(100));
        System.out.println(queue.size());
        notifyAll();
    }

    public synchronized void get() {
        while (queue.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.remove(0);
        System.out.println(queue.size() + " взятие числа");
        if (queue.size() <= 80) {
            notifyAll();
        }
    }

}
