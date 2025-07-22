package BasicSorting;

import java.util.ArrayList;

public class UnionOf2Array {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 3, 4, 5 };
        int[] arr2 = { 3, 4, 5, 5, 6, 7 };

        ArrayList<Integer> union = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            while (i > 0 && i < arr1.length && arr1[i] == arr1[i - 1]) {
                i++;
            }
            while (j > 0 && j < arr2.length && arr2[j] == arr2[j - 1]) {
                j++;
            }
            if (i >= arr1.length || j >= arr2.length)
                break;

            if (arr1[i] == arr2[j]) {
                union.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                union.add(arr1[i]);
                i++;
            } else {
                union.add(arr2[j]);
                j++;
            }
        }

        // Remaining elements in a
        while (i < arr1.length) {
            if (i == 0 || arr1[i] != arr1[i - 1])
                union.add(arr1[i]);
            i++;
        }

        // Remaining elements in b
        while (j < arr2.length) {
            if (j == 0 || arr2[j] != arr2[j - 1])
                union.add(arr2[j]);
            j++;
        }

        System.out.print("Union of the two arrays: ");
        for (int num : union) {
            System.out.print(num + " ");
        }
    }

}
