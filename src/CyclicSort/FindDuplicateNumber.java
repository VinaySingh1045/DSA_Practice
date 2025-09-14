package CyclicSort;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 4, 4, 3, 6, 1 };
        duplicateNum(arr);
    }

    private static void duplicateNum(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i < arr.length) {
            if (arr[i] == i + 1 || arr[i] == n)
                i++;
            else {
                int idx = arr[i] - 1;
                if (arr[i] == arr[idx]) {
                    System.out.println(arr[i]);
                    return;
                }
                swap(arr, i, idx);
            }
        }

    }

    private static void swap(int arr[], int i, int idx) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
