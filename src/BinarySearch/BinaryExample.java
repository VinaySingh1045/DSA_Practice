package BinarySearch;

public class BinaryExample {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 3, 4, 5, 7, 8};
        // int[] arr = { 8, 8, 4, 3, 3, 2, 2, 1, 1};
        int n = arr.length;
        int low = 0, high = n - 1;
        int k = 5; // Element to search

        boolean found = binarySearch(arr, low, high, k);

        if (found) {
            System.out.println("Element " + k + " is present in the array.");
        } else {
            System.out.println("Element " + k + " is not present in the array.");
        }
    }

    // This method assumes the array is sorted in ascending order.
    private static boolean binarySearch(int[] arr, int low, int high, int k) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k)
                return true;
            else if (arr[mid] < k)
                low = mid + 1;
            else if (arr[mid] > k)
                high = mid - 1;
        }
        return false;
    }
    
    // this is for descending order
    // private static boolean binarySearch(int[] arr, int low, int high, int k) {
    //     while (low <= high) {
    //         int mid = (low + high) / 2;
    //         if (arr[mid] == k)
    //             return true;
    //         else if (arr[mid] < k)
    //             // low = mid + 1;
    //             high = mid - 1; // Adjusted for descending order
    //         else if (arr[mid] > k)
    //             low = mid + 1;
    //     }
    //     return false;
    // }
}
