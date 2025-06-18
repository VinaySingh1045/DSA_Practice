package Loop;

import java.util.Scanner;

public class BasicLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String nm = sc.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.println(nm);
        }
    }
}
