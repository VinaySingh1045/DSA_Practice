package BasicSorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElement {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 3, 4, 5, 6, 7 };
        int n1 = a.length;
        int n2 = b.length;

        System.out.println("Common Elements: ");
        findCommonElements(a, b, n1, n2);
    }

    private static void findCommonElements(int[] a, int[] b, int n1, int n2) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                ans.add(a[i]);
                // or we can write "ans.add(a[i]);"
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        for (int num : ans) {
            System.out.print(num + " ");
        }

    }
}
