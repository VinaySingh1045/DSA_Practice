package Arraysss;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int n = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;

        int[] arr = new int[n];
        System.out.println("Enter the Elements: ");

        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }

//        Maxi number
        for (int i = 0; i <n; i++) {
            if(arr[i]> max){
                max = arr[i];
            }
        }
        // Calcuate Second Largest Element
        for (int i = 0; i <n; i++) {
            if(arr[i]> secmax && arr[i] != max){
                secmax = arr[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Second Maximum: " + secmax);

    }
}
