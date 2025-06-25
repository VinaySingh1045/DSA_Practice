package Arraysss;

public class MissingInArray {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        int n = arr.length + 1; // --> +1 kyu -> kyuki index o se hota hai hume 1 se n tak jana hai.

        int sum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int ele : arr) {
            arraySum += ele;
        }
        System.out.println(sum - arraySum);
    }
}
