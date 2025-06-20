package Patterns;

import java.util.Scanner;
// lecture 6
public class StartPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int mid = (n+1)/2; // ---> Why +1 because --> If n = 5, then 5 / 2 = 2 (but the actual center is 3)
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i == mid || j == mid){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }

    }
}
