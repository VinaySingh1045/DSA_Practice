package Loop;

import java.util.Scanner;

public class PrintSumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int sum = 0;

        while (n!=0){
            sum += n%10; // n%10 --> Gives the last digit of any number "n"
            n/=10; // n/10 --> Removes the last digit to go to next
        }
        System.out.println(sum);
    }
}
