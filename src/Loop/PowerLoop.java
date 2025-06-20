package Loop;

import java.util.Scanner;

public class PowerLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b = sc.nextInt();
        int power = 1;

        for (int i = 1; i <=b; i++) {
            power *=a;
        }
        System.out.println(a + " raise to the power " + b + " is " + power);

    }
}
