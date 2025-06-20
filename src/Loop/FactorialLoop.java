package Loop;

import java.util.Scanner;

public class FactorialLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eter the Number: ");
        int n = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <=n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
