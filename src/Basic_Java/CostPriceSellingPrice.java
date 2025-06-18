package Basic_Java;

import java.util.Scanner;

public class CostPriceSellingPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Selling Price: ");
        int a = sc.nextInt();
        System.out.println("Enter Cost Price: ");
        int b = sc.nextInt();

        if(a>b){
            int p = a-b;
            double pp = p/b*100;
            System.out.println("Profit: " + p);
            System.out.println("PercentageProfit: " + pp + "%");
        }
        if(a == b){
            System.out.println("Nothing");
        }
        if(a<b){
            int l =  (b-a);
            double lp = (l * 100)/b;
            System.out.println("Loss: " + l);
            System.out.println("LossPercentage: " + lp + "%");
        }
    }
}
