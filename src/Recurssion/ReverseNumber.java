package Recurssion;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        reverse(number ,0);
    }

    private static void reverse(int n, int r) {
        if (n == 0) {
            System.out.println(r);
            return;
        }
        reverse(n / 10, r * 10 + n % 10);
        
        // while(n!=0){
        // r = r*10;
        // r += n%10;
        // n /= 10;
        // // r = r * 10 + n % 10;
        // // n /= 10;
        // }
        // return r;
    }
}
