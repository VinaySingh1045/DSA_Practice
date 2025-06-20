package Loop;
// Display the GP 1,2,4,8,16,... upto "n" term

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Entrance Value");
        int a  = sc.nextInt();
        System.out.println("Enter the Difference Value");
        int r  = sc.nextInt();
        System.out.println("Enter the nth Term");
        int n  = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.print(a + " ");
            a *= r;
        }
        // an = a*r("r" pe power ayega n-1 ka)
    }
}
