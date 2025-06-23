package Methods;

import java.util.Scanner;

public class PermutationAndCombination {
    public static int fact(int a) {
        int fact1 = 1;
        for (int i = 1; i <=a; i++) {
            fact1 *=i;
        }
        return fact1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number N: ");
        int n = sc.nextInt();
        System.out.print("Enter the Number R: ");
        int r = sc.nextInt();

        int ncr = fact(n)/(fact(r)* fact(n-r));
        int npr = fact(n)/(fact(n-r));

        System.out.println("Combination: " + ncr);
        System.out.println("Permutation: " + npr);

    }
}
