package MultiDimensionArrayss;

public class MaxElement2DArrayy {
    public static void main(String[] args) {
        int[][] arr = {{1,42, 3, 4, 5}, {2, 24, 1, 3, 5}, {8, 4, 6, 2, 3}};
        int m = arr.length;
        int n = arr[0].length;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Maximum Element is: " + max);
    }
}
