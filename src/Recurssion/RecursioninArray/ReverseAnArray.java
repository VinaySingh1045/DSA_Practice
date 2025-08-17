package Recurssion.RecursioninArray;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        reverseRec(arr, i, j);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void reverseRec(int[] arr, int i, int j) {
        if (i > j)
            return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverseRec(arr, i + 1, j - 1);
    }
}
