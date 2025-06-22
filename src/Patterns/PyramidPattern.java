package Patterns;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=n-i; j++) {
//                System.out.print("  ");
//            }
//            for (int k = 1; k <= 2*i-1; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // one more method
        int nsp = n-1 , nst =1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=nsp; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= nst; k++) {
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }

    }
}
