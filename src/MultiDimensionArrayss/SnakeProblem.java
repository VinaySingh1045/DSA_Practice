package MultiDimensionArrayss;

public class SnakeProblem {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {2, 4, 1, 3, 5}, {6, 4, 6, 2, 3},{2, 4, 1, 3, 5}};
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = n - 1; j>= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
