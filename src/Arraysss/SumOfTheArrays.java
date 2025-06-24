package Arraysss;

import java.util.Scanner;

public class SumOfTheArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        System.out.print("Enter the Arrays Elements: ");

        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

    }
}
