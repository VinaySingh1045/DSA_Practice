package Loop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int r = 0;

        while (n!=0){
            r *= 10;
            r+=n%10;
            n/=10;
        }
        System.out.println(r);
    }
}
// you can see in the lecture 5 for notes in pdf.