package MultiDimensionArrayss;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements Size M*N: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int[][] arr = new int[m][n];
        System.out.print("Enter All the elements: ");
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }

        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Sum of all elements: " + sum);
    }
}
