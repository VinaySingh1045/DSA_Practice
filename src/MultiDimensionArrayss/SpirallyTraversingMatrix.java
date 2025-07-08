package MultiDimensionArrayss;

public class SpirallyTraversingMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int m = arr.length;
        int n = arr[0].length;
        int minRow = 0;
        int maxRow = m - 1;
        int minCol = 0;
        int maxCol = n - 1;

        while (minRow <= maxRow && minCol <= maxCol) {

            for (int j = minCol; j <= maxCol; j++) {
                System.out.print(arr[minRow][j] + " ");
            }
            minRow++;

            for (int i = minRow; i <= maxRow; i++) {
                System.out.print(arr[i][maxCol] + " ");
            }
            maxCol--;

            if (minRow <= maxRow) {
                for (int j = maxCol; j >= minCol; j--) {
                    System.out.print(arr[maxRow][j] + " ");
                }
                maxRow--;
            }

            if (minCol <= maxCol) {
                for (int i = maxRow; i >= minRow; i--) {
                    System.out.print(arr[i][minCol] + " ");
                }
                minCol++;
            }
        }
    }
}


/*
  ArrayList<Integer> result = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        int minRow = 0;
        int maxRow = m - 1;
        int minCol = 0;
        int maxCol = n - 1;

        while (minRow <= maxRow && minCol <= maxCol) {

            for (int j = minCol; j <= maxCol; j++) {
                result.add(arr[minRow][j]);
            }
            minRow++;

            for (int i = minRow; i <= maxRow; i++) {
                result.add(arr[i][maxCol]);
            }
            maxCol--;

            if (minRow <= maxRow) {
                for (int j = maxCol; j >= minCol; j--) {
                    result.add(arr[maxRow][j]);
                }
                maxRow--;
            }

            if (minCol <= maxCol) {
                for (int i = maxRow; i >= minRow; i--) {
                    result.add(arr[i][minCol]);
                }
                minCol++;
            }
        }
        return result;
 */
