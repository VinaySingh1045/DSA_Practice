package StringInJava;

public class EasyString {
    public static void main(String[] args) {
        String str = "aaABBb";
        int n = str.length();

        // Convert the string to lowercase to handle case insensitivity
        String lowerString = str.toLowerCase();
        char[] arr = lowerString.toCharArray();
        int i = 0, j = 0;
        StringBuilder result = new StringBuilder();

        while (j < n) {
            if (arr[i] == arr[j]) {
                j++;
            } else {
                int count = j - i;
                // System.out.println("Character: " + arr[i] + ", Count: " + count);
                result.append(count).append(arr[i]);
                i = j;
            }
        }

        if (j > i) {
            int count = j - i;
            result.append(count).append(arr[i]);
        }

        System.out.println("Compressed Output: " + result.toString());

    }
}
// leetcode string compression.