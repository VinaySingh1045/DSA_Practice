package Patterns;

import java.util.Scanner;

public class HollowRectangle_L6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row: ");
        int row = sc.nextInt();
        System.out.print("Enter the col: ");
        int col = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();
        }

    }
}
