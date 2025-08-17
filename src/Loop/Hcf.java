package Loop;

public class Hcf {
    public static void main(String[] args) {
        int a = 12, b = 16;
        int hcf = findHCF(a, b);
        System.out.println("HCF of " + a + " and " + b + " is: " + hcf);
    }
    public static int findHCF(int a, int b) {
        int hcf = 1;
        for (int i = 2; i < Math.min(a, b); i++) {
            if(a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }

    // public static int findHCF(int a, int b) {
    //     if (b == 0) {
    //         return a;
    //     }
    //     return findHCF(b, a % b);
    // }
}
