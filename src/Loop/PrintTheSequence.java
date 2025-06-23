package Loop;

import java.util.Scanner;

// Print the Sequence by taking n input from the user --> 1,n ,2 ,n-1 ,3 ,n-2 ,4 ,n-3 ,5
public class PrintTheSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int odd = 1;
        int even = n;

        for (int i = 1; i <=n; i++) {
            if(i%2!=0){
                System.out.println(odd);
                odd++;
            }
            if(i%2==0) {
                System.out.println(even);
                even--;
            }
        }
    }
}
