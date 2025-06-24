package Arraysss;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the Elements of an array: ");

        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
//        int max = arr[0];
        int max = Integer.MIN_VALUE; // we can do by both uppar is also correct and this one is also

        for (int i = 0; i <n; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
