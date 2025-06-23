package Loop;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(n==0) n=1; //ya koi bhi number de sakte taki count ho jaye kyuki 0 de raha hai agar n==0 hai to.
        int count = 0;

        while (n!=0){
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}
