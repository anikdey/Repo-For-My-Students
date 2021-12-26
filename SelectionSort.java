package exercise;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = {22,23,46,54,98,34,12,11};
        int n = array[0];
        int m = 0;
        int t = 0;

        while(m <= array.length) {

            for (int i = t; i < array.length; i++) {

                if (n > array[i]) {

                    n = array[i];
                    array[i] = array[m];
                    array[m] = n;
                }
            }
            if(t < array.length - 1) {
                t++;
                n = array[t];
            }
            m++;
        }
        System.out.println(Arrays.toString(array));
    }
}
