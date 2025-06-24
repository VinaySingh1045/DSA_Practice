package Arraysss;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10,2,3,4};
        System.out.println("Shallow Copy");
        // arr ki copy banata hai or usko hi change karta hai.
        int[] x = arr;
        x[0] = 100;
        System.out.println(arr[0]);

        System.out.println("Deep Copy");
        // copy bananta hai but new array me purna wala change nahi hota hai.
        int[] y = Arrays.copyOf(arr,arr.length);
        y[0] = 100;
        System.out.println(arr[0]); // nothing change
        System.out.println(y[0]);
    }
}
