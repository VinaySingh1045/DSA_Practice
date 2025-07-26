package StringInJava;

import java.util.Arrays;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String str = "hello";

        int n = str.length();
        int[] freq = new int[25];

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            System.out.println("Character: " + ch + ", Frequency: " + freq[ch - 'a']);
            if (freq[ch - 'a'] == 1) {
                System.out.print(ch + " ");
                return;
            }
        }

        // this is for sorted array.

        // String str = "vviinnaay";

        // char[] arr = str.toCharArray();
        // Arrays.sort(arr);

        // // for (char c : arr) {
        // // System.out.print(c + " ");
        // // }
        // int n = str.length();
        // int i = 0, j = 0;
        // while (j < n) {
        // j = i + 1;
        // while (j < n && arr[i] == arr[j]) {
        // j++;
        // }
        // if (j - i == 1) {
        // System.out.print(arr[i]);
        // return;
        // }
        // i = j;
        // // if (arr[i] == arr[j]) {
        // // j++;
        // // } else {
        // // if (j - i == 1) {
        // // System.out.print(arr[i] + " ");
        // // return;
        // // }
        // // i = j;
        // // }
        // }
    }
}