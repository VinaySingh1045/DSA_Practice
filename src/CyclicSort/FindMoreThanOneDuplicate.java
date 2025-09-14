package CyclicSort;

import java.util.ArrayList;

public class FindMoreThanOneDuplicate {

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 4, 3, 5, 1};

        ArrayList<Integer> duplicates = findDuplicates(arr);
        System.out.println("Duplicates: " + duplicates);
    }

    public static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int i = 0;

        while (i < n) {
            int rightIdx = arr[i] - 1;

            if (arr[i] == i + 1 || arr[rightIdx] == arr[i]) {
                i++;
            } else {
                swap(arr, i, rightIdx);
            }
        }

        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1 && !ans.contains(arr[i])) {
                ans.add(arr[i]);
            }
        }

        return ans;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
