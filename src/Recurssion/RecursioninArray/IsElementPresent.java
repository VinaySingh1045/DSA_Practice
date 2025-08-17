package Recurssion.RecursioninArray;

public class IsElementPresent {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 8, 9, 10 };
        int ele = 9;
        System.out.print(elementExists(arr, ele, 0));
    }

    private static boolean elementExists(int[] arr, int ele, int idx) {
        // System.out.print(arr[idx] + " ");
        if (idx == arr.length)
            return false;
        System.out.print("ele: " + ele + " idx: " + idx);
        if (arr[idx] == ele) {
            return true;
        }
        return elementExists(arr, ele, idx + 1);
    }
}
