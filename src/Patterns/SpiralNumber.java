package Patterns;

import java.util.Scanner;

public class SpiralNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numnber: ");
        int n = sc.nextInt();

        for (int i = 1; i <=2*n-1; i++) {
            for (int j = 1; j <=2*n-1; j++) {
                int a =i;
                int b =j;
                if(i>n) a = 2*n-i;
                if(j>n) b = 2*n-j;
//                if(i<j) System.out.print(i + " ");
//                else System.out.print(j + " ");
                System.out.print(Math.min(a,b) + " ");
            }
            System.out.println();
        }

        // nichhe wala half hai bus aise hi rkh diya hai

//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=n; j++) {
//                  if(i<j) System.out.print(i + " ");
//                else System.out.print(j + " ");
////                System.out.print(Math.min(i,j) + " ");
//            }
//            System.out.println();
//        }
        
    }
}
