package Arraysss;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Elements: ");

        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Element to Search: ");
        int element = sc.nextInt();

        boolean flag = false;
        for (int i = 0; i <n; i++) {
            if(arr[i] == element){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("Element is present in the array");
        }
        else {
            System.out.println("Element is not present in the array");
        }

    }
}
