package StringInJava;

public class CountVowles {
    public static void main(String[] args) {
        String str = "vinay"; // You can change this input
        int result = countVowels(str);
        System.out.println("Count of vowels in the string: " + result);
    }

    private static int countVowels(String str) {
        int count = 0;
        // String vowels = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}
