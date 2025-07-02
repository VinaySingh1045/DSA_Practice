package MultiDimensionArrayss;

public class Rotate90Degree {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 3, 4, 5},
                {4, 1, 3, 5},
                {4, 6, 2, 3},
                {9, 8, 2, 3}
        };

        int n = arr.length;
        int m = arr[0].length;

        // First I will Transpose

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }
        // yaha pe hum ek loop me array of array ki ek array ko hum
        // swap kar de rahe hai. one by one.
        for (int col = 0; col < n; col++) {
            int i = 0, j = n - 1;

            while (i < j) {
                int temp = arr[i][col];
                arr[i][col] = arr[j][col];
                arr[j][col] = temp;
                i++;
                j--;
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
