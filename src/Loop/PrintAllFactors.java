package Loop;

import java.util.Scanner;

public class PrintAllFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        // 60 = 1,2,3,4,5,6, (under root 60) 10,12,15,20,30,60
        // if you count you will find the pair so to count the total number factor we will not using \
        // the n-1 because it check on every condition we can check only one side and just double that
        // to get all the factors this is also done in the composite and prime number

        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if(n%i == 0){
                System.out.println(i);
             if(!(i == n/i)){ // ye likha hai taki do baar same number na print kar de.
                System.out.println(n/i);
             }
            }
        }

    }
}
