package MultiDimensionArrayss;

import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangleArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> a = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                a.add(0);
            }
               arr.add(a);
        }
        System.out.println(arr);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(j==0 || j==i){
                    arr.get(i).set(j,1);
                }
                else {
                    int up = arr.get(i-1).get(j);
                    int upLeft = arr.get(i-1).get(j-1);

                    arr.get(i).set(j,up + upLeft);

                }
            }
        }
        // Pretty print the triangle
        for (ArrayList<Integer> a : arr) {
            System.out.println(a);
        }
    }
}
