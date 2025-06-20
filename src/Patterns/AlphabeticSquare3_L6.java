package Patterns;

import java.util.Scanner;

public class AlphabeticSquare3_L6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
//            char ch =  (char) ('A' + i - 1); // Get character for the row
//
//            if(i%2 == 0){
//                ch = (char) ('a' + i - 1);
//            }

            // Upar wala bhi sahi hai.

            char ch;

            if (i % 2 == 0) {
                ch = (char) ('A' + i - 1); // Uppercase for even rows
            } else {
                ch = (char) ('a' + i - 1); // Lowercase for odd rows
            }

            for (int j=1; j<=n; j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
