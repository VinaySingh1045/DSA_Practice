package SolvingRandomGFGQuestions;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Digit: ");
        int n = sc.nextInt();
        int original = n;
        int count = 0;

        if (n == 0) count = 1;
        while (n != 0) {
            int digit = n % 10;
            if (digit != 0 && original % digit == 0) {
                count++;
            }
            n = n / 10;

            System.out.println("n = " + n + ", count = " + count + ", digit = " + digit);
        }
        System.out.println(count);

    }
}
