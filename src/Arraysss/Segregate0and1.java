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
        for (int i = numberOfZeros; i < arr.length; i++) {
            arr[i] = 1;
        }

        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
