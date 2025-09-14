package MergeSort;

import java.util.Arrays;

public class ExampleOnMerge {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 4, 2, 6 };
        // int[] b = { 2, 4, 6, 8 };
        // int[] c = new int[a.length + b.length];

        // merge(a, b, c);
        mergesSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    // Divide and Conqure Technique
    // TC: n log
    // AS: O(n logn) / O(n);
    public static void mergesSort(int[] arr) {
        int n = arr.length;
        // if (arr.length <= 1) {
        // return;
        // }
        // or
        if (n == 1)
            return;
        // Step 1: Create 2 empty array of size n/2 each;
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        // Step 2: Copy-paste arr into a and b; 
        // idx travel karega as a index;
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[idx++];
        }
        System.out.println("Left array a: " + Arrays.toString(a));
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[idx++];
        }
        System.out.println("right array b: " + Arrays.toString(b));
        // step: 3 Magic
        mergesSort(a);
        mergesSort(b);
        // merge a and b in single arr.
        merge(a, b, arr);

    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        // Compare elements of both arrays and insert smaller one into c[]
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                // c[k] = a[i];
                // k++;
                // i++;
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        // Copy remaining elements of a[], if any
        while (i < a.length) {
            c[k++] = a[i++];
        }

        // Copy remaining elements of b[], if any
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }

}
