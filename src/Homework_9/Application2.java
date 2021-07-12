package Homework_9;

import java.util.Arrays;
import java.util.function.Function;


public class Application2 {

    public static <T> T[] filter(T[] array, Filter filter) {
        int offset = 0;

        for (int i = 0; i < array.length; i++) {
            if (!filter.apply(array[i])) {
                offset++;
            } else {
                array[i - offset] = array[i];
            }
        }

        return Arrays.copyOf(array, array.length - offset);
    }


    public static void main(String[] args) {
        String[] array = {"sss ", "dddd", "aaa", null, "123"};
        Integer[] array1 = {1, 0, 2, 3, 4};

        String[] newArray = filter(array, new Filter() {
            @Override
            public boolean apply(Object o) {
                if (o == null) {
                    return false;
                } else {
                    return true;
                }
            }
        });

        Integer[] newArray1 = filter(array1, new Filter() {
            @Override
            public boolean apply(Object o) {
                if ((Integer)o == 0) {
                    return false;
                } else {
                    return true;
                }
            }
        });
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(newArray1));

    }

}
