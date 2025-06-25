package Arraysss;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {10,45,18,99,7,17,41,19};
        int n = arr.length;
        int d = 3;

//        All this work for d is less then n but of d is greater eg:
//        Input: arr[] = [7, 3, 9, 1], d = 9
//        Output: [3, 9, 1, 7]
//        Explanation: when we rotate 9 times, we'll get 3 9 1 7 as resultant array.
//      Then we have to do the d%n because
//       rotating by d = 9 in an array of n = 4 is the same as rotating by 9 % 4 = 1.
        // one more if we take d = 8 and rotate by 4 then it will give same. or haa agar d chota
        // hai n se to vahi aa jata hai.

        d%=n;
        Rotate(arr,0,d-1);
        Rotate(arr,d,n-1);
        Rotate(arr,0,n-1);

        System.out.print("Rotated Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

    static void Rotate(int[] arr, int i, int j){
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
