package CyclicSort;

import java.util.Arrays;

public class HowWorks {
    public static void main(String[] args) {
        int arr[] = { 8,2,4,5,3,7,1,6,0}; // always you have to take number 0 in the array
        cyclicSortWithZero(arr);
        System.out.println("WithZero Sort: " + Arrays.toString(arr));
        
        int arr1[] = { 8,2,4,5,3,7,1,6}; // always you have to take number 0 in the array
        cyclicSortWithOutZero(arr1);
        System.out.println("WithOutZero Sort: " + Arrays.toString(arr1));
    }

    private static void cyclicSortWithZero(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i < arr.length) {
            if (arr[i] == i || arr[i] == n)
                i++;
            else {
                int idx = arr[i]; // element(ele) ki jaga humne idx rakh liya hai
                // kyuki hume ele ko as a index use karna hai.
                swap(arr, i, idx);
            }
        }

    }
    
    private static void cyclicSortWithOutZero(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i < arr.length) {
            if (arr[i] == i + 1 || arr[i] == n)
                i++;
            else {
                int idx = arr[i] - 1; // element(ele) ki jaga humne idx rakh liya hai
                // kyuki hume ele ko as a index use karna hai.
                swap(arr, i, idx);
            }
        }

    }

    private static void swap(int[] arr, int i, int idx) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
