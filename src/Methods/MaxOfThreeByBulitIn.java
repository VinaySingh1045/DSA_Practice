package Methods;

import java.util.Scanner;

public class MaxOfThreeByBulitIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Number: ");
        int c = sc.nextInt();
        System.out.print("Enter the Fourth Number: ");
        int d = sc.nextInt();

        System.out.println(Math.max(Math.max(a,b),c));
        System.out.println(Math.max(a,Math.max(b,Math.max(c,d)))); // for 4 variable
        System.out.println(Math.max(Math.max(a,b),Math.max(c,d))); // for 4 variable

//        There is one more Math.pow(a,b) method
//        Clearly it calculates a raised to the power b
//        Here a and b can be real numbers also
//        Make sure that a is not negetive and if it is then b has to be integer

        System.out.println(Math.pow(2,3));

    }
}
