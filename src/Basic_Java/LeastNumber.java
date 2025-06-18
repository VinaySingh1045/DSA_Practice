package Basic_Java;

import java.util.Scanner;

public class LeastNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd number: ");
        int c = sc.nextInt();

        if(a<b){
            if(a<c){
                System.out.println("a is small");
            } else {
                System.out.println("c is small");
            }
        } else {
            if(b<c){
                System.out.println("b is small");
            } else {
                System.out.println("c is small");
            }
        }

    }
}
