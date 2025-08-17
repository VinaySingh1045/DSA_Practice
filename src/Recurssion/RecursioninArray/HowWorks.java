package Recurssion.RecursioninArray;

public class HowWorks {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 8, 9, 10 };
        recPrint(arr, 0);
    }

    private static void recPrint(int[] arr, int idx) {
        if(idx == arr.length) return;
        recPrint(arr, idx+1); // for reverse
        System.out.print(arr[idx] + " ");
        // recPrint(arr, idx+1);
    }
}
