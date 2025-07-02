package MultiDimensionArrayss;

public class FindRowWithMaxSum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {2, 4, 1, 3, 5}, {6, 4, 6, 2, 3}};
        int m = arr.length;
        int n = arr[0].length;

        int maxRow = -1;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxRow = i;
            }
        }
        System.out.println("Maximum Sum: " + maxSum);
        System.out.println("Maximum Row: " + maxRow);
    }
}
