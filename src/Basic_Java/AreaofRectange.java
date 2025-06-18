package Basic_Java;

import java.util.Scanner;

public class AreaofRectange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length: ");
        int l = sc.nextInt();
        System.out.println("Breadth: ");
        int b = sc.nextInt();
        int aor = l*b;
        int aop = 2 * (l + b);

        if(aor > aop) System.out.println("Area of rectange is " + aor + " Greater");
        else System.out.println("Area of perimeter is " + aop + " Greater");
    }
}
