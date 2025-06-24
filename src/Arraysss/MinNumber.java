package Arraysss;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Elements: ");

        for (int i = 0; i <n; i++) {
            arr[i]= sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <n; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);


    }
}
