package Arraysss;

import java.util.Scanner;

public class ProductOfTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();
        int prod = 1;
        int[] arr = new int[n];

        System.out.print("Enter the array elements: ");
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <n; i++) {
            prod *=arr[i];
        }
        System.out.println(prod);

    }
}
