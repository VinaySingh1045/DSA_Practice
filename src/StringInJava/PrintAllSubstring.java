package StringInJava;

public class PrintAllSubstring {
    public static void main(String[] args) {
        String str = "6759";
        printAllSubstrings(str);
    }

    private static void printAllSubstrings(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(str.substring(i, j + 1) + " ");
            }
            System.out.println();
        }
    }
}
