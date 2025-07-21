package BasicSorting;

public class MovesZeroToEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4, 5, 0, 5, 0 };
        int n = arr.length;
        System.out.println("Original Array: ");
        print(arr, n);
        int j = 0;
        // while (i < j) {
        //     if (arr[i] == 0 && arr[j] != 0) {
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = temp;
        //         i++;
        //         j--;
        //     } else if (arr[i] != 0) {
        //         i++;
        //     } else if(arr[j] == 0) {
        //         j--;
        //     }
        // }
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                if(i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        System.out.println("Array after moving zeros to the end: ");
        print(arr, n);
    }

    private static void print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
