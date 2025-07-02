package MultiDimensionArrayss;

public class MinimumElementOfMaximum {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 33, 42, 35},
                {2, 44, 21, 33, 25},
                {3, 43, 63, 2, 33}
        };
        int m = arr.length;
        int n = arr[0].length;
        int overALlMin = Integer.MAX_VALUE;

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < m; i++) {
            int max = arr[i][0];
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
//        System.out.println(max);
//            System.out.println();
            if(max < overALlMin){
                overALlMin = max;
            }
        }
        System.out.println("Minimum of row-wise maximums is: " + overALlMin);
    }
}
