package Loop;

import java.util.Scanner;

// Print the Sequence by taking n input from the user --> 1,n ,2 ,n-1 ,3 ,n-2 ,4 ,n-3 ,5
public class PrintTheSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N Term");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.println(i);
//            System.out.println(n);
            System.out.println(n-i);
        }
    }
}
