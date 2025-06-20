package Loop;
// Display this Ap: 2,5,8,11,... upto "n" terms

import java.util.Scanner;

public class ArithmethicProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

//        for (int i = 2; i <= (3*n-1); i+=3) {
//            System.out.println(i);
//        }

        // another way If don't want to bring the formula
        int a = 2, d=3;
        for (int i = 0; i <= n; i++) {
            System.out.print(a + " ");
            a+=d;
        }
    }
}

// an = a + (n-1)*d
// a --> initialization 2, d --> gap b/t the numbers which is "3" (2,3,8,11...)