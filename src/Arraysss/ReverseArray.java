package Arraysss;

public class ReverseArray {
//    This is two pointer-technique
//    Two pointer means: you use two index variables
//    (or "pointers") to solve the problem more efficiently
//    by processing the array from both ends or both directions at once.
    public static void main(String[] args) {
        int[] arr = {10,45,18,99,07,17,41,19};
        int n = arr.length;

        int i = 0, j =n-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

//  By for loop but note while loop is the best method as we need the condition first;

//        for (int i = 0; i <n/2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[n-1-i];
//            arr[n-1-i] = temp;
//        }
        System.out.print("Reverse is: ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
