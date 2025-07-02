package MultiDimensionArrayss;

public class SetZerosInMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 0, 2, 1, 7, 0},
                {8, 2, -2, 3, -5, -9},
                {4, 5, 6, 4, 0, 3},
                {1, 2, 0, 2, 4, 9}
        };
//        Method1(arr);
        Method2(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }

    private static void Method2(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        boolean firstColZero = false;
        boolean firstRowZero = false;

        for (int j = 0; j < n; j++) {
            if (arr[0][j] == 0) firstRowZero = true;
        }
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) firstColZero = true;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
        }

    }

    private static void Method1(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        //mark rows to zero
        for (int i = 0; i < m; i++) {
            if (row[i] == true) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        //mark cols to zero
        for (int j = 0; j < n; j++) {
            if (col[j] == true) {
                for (int i = 0; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }

    }
}
