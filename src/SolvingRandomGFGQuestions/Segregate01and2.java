package SolvingRandomGFGQuestions;

import java.util.Scanner;

public class Segregate01and2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int n= sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the 0,1 and 2 Elements Only:  ");

        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }

        int noOfZeros = 0;
        int noOfOnes = 0;

        for(int ele : arr){
            if(ele == 0) noOfZeros++;
            else if (ele == 1) noOfOnes++;
        }

        for (int i = 0; i <n; i++) {
            arr[i] = 0;
        }
        for (int i = noOfZeros; i <n; i++) {
            arr[i] = 1;
        }
        for (int i = noOfZeros + noOfOnes; i < arr.length; i++) {
            arr[i] = 2;
        }

        for (int ele : arr){
            System.out.print(ele + " ");
        }

    }
}
