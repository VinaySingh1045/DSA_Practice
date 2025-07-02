package MultiDimensionArrayss;

public class SearchInRowColSorted {
    public static void main(String[] args) {
        int arr[][] = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int m = arr.length;
        int n = arr[0].length;
        int i = 0, j = n - 1;
        int target = 20;
        boolean found = false;

        while (i < m && j>=0) {
            if (arr[i][j] == target) {
                found = true;
                break;
            }
            else if(arr[i][j] < target){ // agar chota hai to next row me jana hai (as a down)
                i++;
            }
            else {
                j--;
            }
        }
        if(found) System.out.println("Target Found");
        else System.out.print("Target Not Found");

//        for (int i = 0; i <m; i++) {
//            for (int j = 0; j <n; j++) {
//                System.out.print(arr[i][j] + "    ");
//            }
//            System.out.println();
//        }
    }
}
