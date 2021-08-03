package Homework_14;

import com.sun.jmx.remote.internal.ArrayQueue;

public class AppForProdCons {

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue(new ArrayQueue<Integer>(200));


        new Producer(myQueue).start();
        new Producer(myQueue).start();
        new Producer(myQueue).start();
        new Consumer(myQueue).start();
        new Consumer(myQueue).start();

    }

}
