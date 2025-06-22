package Patterns;

import java.util.Scanner;

public class VeriticalTriangleFilpped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) { // n+1-i --> we have already used this
                System.out.print("  ");
            }for (int k = 1; k <=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
