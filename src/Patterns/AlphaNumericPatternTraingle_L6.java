package Patterns;

import java.util.Scanner;

public class AlphaNumericPatternTraingle_L6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            char ch;
            if(i%2 != 0){
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
            }
            else if(i%2 == 0){
                for (int j = 0; j < i; j++) {
                    System.out.print((char) ('A' + j));
                }
            }
            System.out.println();
        }
        
    }
}
