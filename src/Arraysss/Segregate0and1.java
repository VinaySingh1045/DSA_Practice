package Arraysss;

public class Segregate0and1 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0};
        int n = arr.length;
        int numberOfZeros = 0;

        for (int ele : arr){
            if(ele == 0) numberOfZeros++;
        }

        // fill zeors in array
        for (int i = 0; i <numberOfZeros; i++) {
            arr[i] = 0;
        }

        // for 1
        for (int i = numberOfZeros; i < n; i++) {
            arr[i] = 1;
        }

        for (int ele : arr){
            System.out.print(ele + " ");
        }

        // one more method

//        int i = 0, j = n - 1;
//        while (i < j) {
//            if (arr[i] == 0) i++;
//            if (arr[j] == 1) j--;
//            if (i > j) break;
//
//            if (arr[i] == 1 && arr[j] == 0) {
//                arr[i] = 0;
//                arr[j] = 1;
//                i++;
//                j--;
//            }
//        }
//
//        for (int ele : arr){
//            System.out.print(ele + " ");
//        }
//
         // Another Method

//        int i = 0, j = n - 1;
//        while (i < j) {
//            if (arr[i] == 0) {
//                i++;
//            }
//            else if (arr[j] == 1) {
//                j--;
//            }
//            else if (arr[i] == 1 && arr[j] == 0) {
//                arr[i] = 0;
//                arr[j] = 1;
//                i++;
//                j--;
//            }
//        }
//
//        for (int ele : arr){
//            System.out.print(ele + " ");
//        }

    }
}
