package Homework_13;

import java.util.Random;

public class MyThread extends Thread {

    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Random rand = new Random();
        int[] array = new int[10];
        int max = 0;
        for (int i = 0; i<array.length; i++) {
            array[i] = rand.nextInt(100);
            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(getName() + " - " + max);
    }

}
