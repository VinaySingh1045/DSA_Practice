package BasicSorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 2, 0};
        int n = arr.length;
        System.out.println("Original Array: ");
        print(arr, n);
//      System.out.println();
//      ye method ki time complexity O(n^2) jo ki bhaut karab hai.
//      isi method ko notebook me se idhar pdhne ko bola hai as a first method
        System.out.println();
//      method1(arr, n);
        method2(arr, n);
    }

    private static void method2(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            int swap = 0;
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if(swap == 0) break;
        }
        System.out.println("Sort Array: ");
        print(arr, n);
    }

    private static void method1(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sort Array: ");
        print(arr, n);
    }

    private static void print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
