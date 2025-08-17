package Recurssion;

public class FirstOccurrence {
    static int index = -1;

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int x = 5;
        int n = arr.length;
        int high = n - 1;
        int low = 0;
        int result = firstoccrec(arr, x, low, high);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }

    }

    private static int firstoccrec(int[] arr, int x, int low, int high) {
        if (low > high)
            return index;
        int mid = low + (high - low) / 2;
        if (arr[mid] == x) {
            index = mid;
            System.out.print("index: " + index);
            System.out.print("mid: " + mid);
            return firstoccrec(arr, x, low, mid - 1);
        }
        else if (arr[mid] > x)
            return firstoccrec(arr, x, low, mid - 1);
        else
            return firstoccrec(arr, x, mid + 1, high);

    }
}
