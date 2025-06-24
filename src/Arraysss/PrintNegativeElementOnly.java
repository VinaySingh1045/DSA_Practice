package Arraysss;

import java.util.Scanner;

public class PrintNegativeElementOnly {
    public static void main(String[] args) {
//        int[] arr = new int[1,2,3,4,-5,2,-12];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Array Elements: ");

        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <n; i++) {
            if(arr[i]<0){
                System.out.print(arr[i] + " ");
            }
        }

    }
}
