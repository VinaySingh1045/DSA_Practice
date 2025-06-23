package Methods;

import java.util.Scanner;

public class Swap2Numbers {

//    public static int[] swap(int a , int b){
//        int temp =a;
//        a=b;
//        b=temp;
//        return new int[]{a, b};
//    }
    public static void swap(int a, int b) {
            int temp = a;
            a = b;
            b = temp;
            System.out.println("Swapped inside method: " + a + " " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value a: ");
        int a = sc.nextInt();
        System.out.println("Enter the Value b: ");
        int b = sc.nextInt();
        System.out.println("Original: " + a + " " + b);

        swap(a,b);

        // ye ek method tha

//        int[] result = swap(a, b);
//
//        System.out.println("Swapped Numbers: " + result[0] + " " + result[1]);


    }
}
