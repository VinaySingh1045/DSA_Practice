package Basic_Java;

import java.util.Scanner;

public class FindQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X-axis: ");
        int x = sc.nextInt();
        System.out.println("Enter Y-axis: ");
        int y = sc.nextInt();

        if(x== 0 & y == 0){
            System.out.println("Lies on Origin");
        } else if(x>0 && y>0){
            System.out.println("First Quadrant");
        } else if(x<0 && y>0){
            System.out.println("Second Quadrant");
        } else if(x<0 && y<0){
            System.out.println("Third Quadrant");
        } else if(x>0 && y<0){
            System.out.println("Fourth Quadrant");
        }

    }
}
