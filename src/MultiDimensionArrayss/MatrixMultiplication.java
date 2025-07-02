package MultiDimensionArrayss;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] arr1 = {{7, 8}, {2, 9}};
        int[][] arr2 = {{14, 5}, {5, 18}};
        int n = 2;
        int[][] arr3 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // c[i][j] ith row of arr1 * jth col of arr2
                for (int k = 0; k < n; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println("Matrix Multiplication Result:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
