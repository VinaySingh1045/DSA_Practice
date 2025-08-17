package Recurssion.RecursioninArray;

public class BinarySearchinRec {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 8, 9, 10 };
        int ele = 9;
        int n = arr.length;
        int low = 0, high = n - 1;
        int result = recPrint(arr, ele, low, high);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

    private static int recPrint(int[] arr, int ele, int low, int high) {
        if (low > high)
            return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == ele)
            return mid;
        if (arr[mid] > ele)
            return recPrint(arr, ele, low, mid - 1);
        else
            return recPrint(arr, ele, mid + 1, high);
    }
}
