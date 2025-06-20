package Loop;

import java.util.Scanner;

public class DivisibleBy3OddNumber {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the ");
        for (int i = 0; i < 101; i++) {
            if(i%3 == 0){
                System.out.println(i);
            }
        }
    }
}
