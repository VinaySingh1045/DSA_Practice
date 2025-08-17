package Recurssion;

import java.util.Scanner;

public class PowerAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int a = sc.nextInt();
        System.out.print("Enter Exponent: ");
        int b = sc.nextInt();
        System.out.println(a + " raised to the power " + b + " is " + powLog(a, b));
    }

    // 2rd method - using log(n) time complexity
    public static int powLog(int a, int b) {
        if (b == 0)
            return 1;
        int call = powLog(a, b / 2);
        if (b % 2 == 0)
            return call * call;
        else
            return a * call * call;
    }

    // 1st method - using O(n) time complexity
    public static int pow(int a, int b) {
        if (b == 0)
            return 1;
        return a * pow(a, b - 1);
    }
}
