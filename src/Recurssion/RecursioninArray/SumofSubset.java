package Recurssion.RecursioninArray;

import java.util.ArrayList;

public class SumofSubset {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5 };
        int n = arr.length;
        ArrayList<Number> ans = new ArrayList<>();
        int idx = 0;
        int currentSum = 0;
        subsetRec(arr, ans, idx, currentSum);
        System.out.println("currentSum: " + ans);
    }

    private static void subsetRec(int[] arr, ArrayList<Number> ans, int idx, int currentSum) {
        if (idx == arr.length) {
            System.out.println(ans.add(currentSum));
            return;
        }
        // 1. Include current element
        ans.add(arr[idx]);
        subsetRec(arr, ans, idx + 1, currentSum + arr[idx]);

        // Backtrack: remove the last added element
        ans.remove(ans.size() - 1);

        // 2. Exclude current element
        subsetRec(arr, ans, idx + 1, currentSum);
    }

}
