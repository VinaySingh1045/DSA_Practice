package Patterns;

import java.util.Scanner;

public class FilledStarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n ; i++) {
            for (int j = n; j>=i; j--) {
//            for (int j = 1; j <= n+1-i; j++) { // This is the standard method
                System.out.print("*" + " ");
//                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
