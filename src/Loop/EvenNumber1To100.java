package Loop;

public class EvenNumber1To100 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 101; i++) {
            if(i%2 == 0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total number: " + count);
    }
}
