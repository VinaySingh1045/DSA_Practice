package CyclicSort;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int arr[] = { 8, 2, 4, 5, 3, 7, 1 };
        missingNum(arr);
    }

    private static void missingNum(int arr[]) {
        int n = arr.length + 1; // n-1 is given
        System.out.println("n: " + n);
        int i = 0;

        while (i < arr.length) {
            if (arr[i] == i + 1 || arr[i] == n) {
                i++;
            } else {
                int idx = arr[i] - 1;
                swap(arr, i, idx);
            }
        }
        for ( i = 0; i < arr.length; i++) {
            if(arr[i] != i+1) {
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(n);
        return;
    }

    private static void swap(int arr[], int i, int idx) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
