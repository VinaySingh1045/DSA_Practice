package StringInJava;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Hello World";

        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        for(String word : words){
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            result.append(reversedWord.toString());
            result.append(" ");
        }
        // Remove the trailing space
        System.out.println(result.toString().trim());

    }
}
