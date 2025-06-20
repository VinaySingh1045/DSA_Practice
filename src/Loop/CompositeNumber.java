package Loop;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        boolean flag = true;
//        for (int i = 2; i <=n ; i++) { // yaha pe kya hoga ki agar hum 10000 liye to uthni baar chalegi
        for (int i = 2; i <=Math.sqrt(n) ; i++) { // if i factor hai n ka to n/i bhi factor hoga n ka
            // ek tarike se uska square hoga agar hum i=n/i kare to i square ho raha hai
            if(n%i == 0){ // i toh n ka factor nikalega
                flag = false;
                break;
            }
        }
        if(n==1) System.out.println("Nethier prime nor composite Number");
        else if(flag == false) System.out.println("Composite Number");
        else System.out.println("Prime Number");

    }
}

// yaha pe me sochunga ki 2 se start kyu kiya kyuki composite number kam se kam 2 se divide hota matalb
// ek 1 se and dusra n-1 se
// A composite number is a positive integer that has more than two factors (divisors);