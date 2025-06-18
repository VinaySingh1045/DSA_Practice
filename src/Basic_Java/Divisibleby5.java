package Basic_Java;

import java.util.Scanner;

public class Divisibleby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int a = sc.nextInt();
        if(a%5 == 0){
            System.out.println("Yes It's Divisible");
        }
        else {
            System.out.println("No It's Divisible");
        }
    }
}
