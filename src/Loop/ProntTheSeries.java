package Loop;

import java.util.Scanner;
// Print the Series 99,95,91,87,... upto all terms which are positive
public class ProntTheSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Entrance Value");
        int a  = sc.nextInt();
        System.out.println("Enter the Difference Value");
        int d  = sc.nextInt();
//        System.out.println("Enter the nth Term");
//        int n  = sc.nextInt();

//        for (int i = 1; i <=n; i++) {
//            System.out.println(a + " ");
//            a = a-d;
//        }

        // in this question we don't have the nth terms we have to go till the positive (i>0)

        // No need for nth term if we're just printing all positive terms
        int term = a;

        while (term > 0) {
            System.out.print(term + " ");
            term = term - d;
        }

    }
}
