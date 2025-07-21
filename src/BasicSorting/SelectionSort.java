package BasicSorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 4, 2, 0 };
        int n = arr.length;
        System.out.println("Original Array: ");
        print(arr, n);
        System.out.println();
        SelectionnSort1(arr, n);
    }

    // private static void SelectionnSort1(int[] arr, int n) {
    // for (int i = 0; i < n - 1; i++) { // n-1 passes
    // int max = Integer.MIN_VALUE, mindx = -1;

    // for (int j = i; j < n; j++) {
    // if (arr[j] > max) {
    // max = arr[j];
    // mindx = j;
    // }
    // }

    // // Swap the found minimum with the element at position i
    // int temp = arr[i];
    // arr[i] = arr[mindx];
    // arr[mindx] = temp;
    // }
    // System.out.println("Selection Sort Array: ");
    // print(arr, n);
    // }

    private static void SelectionnSort1(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) { // n-1 passes
            int min = Integer.MAX_VALUE, mindx = -1;

            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }

            // Swap the found minimum with the element at position i
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        System.out.println("Selection Sort Array: ");
        print(arr, n);
    }

    private static void print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
