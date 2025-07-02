package MultiDimensionArrayss;

public class TransposeArrayy {
    public static void main(String[] args) {
        int[][] arr = {
                        {2, 3, 4, 5},
                        {4, 1, 3, 5},
                        {4, 6, 2, 3},
                        {9, 8, 2, 3}
                      };
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
//                System.out.print(arr[i][j] + " ");

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
            System.out.println();
        }

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
