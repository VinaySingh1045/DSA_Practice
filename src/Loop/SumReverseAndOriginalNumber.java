package Loop;

import java.util.Scanner;

public class SumReverseAndOriginalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int original = n;
        int r = 0;

        while (n!=0){
            r *= 10;
            r += n%10;
            n /= 10;
        }
        System.out.println(original);
        System.out.println(r);
        System.out.println(original+r);
    }
}
