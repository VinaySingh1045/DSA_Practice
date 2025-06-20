package Patterns;

import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
//            int num =1; // +2 hokar print hota hai.
        for (int i = 1; i <=n; i++) {
            int num =1;
            for (int j = 1; j <=i; j++) {
//                if(){
                    System.out.print(num + " ");
//                }
                num+=2;
            }
            System.out.println();
        }

    }
}
