package Methods;

public class RetrunType {
    public static int hello() {
        System.out.println("World");
        System.out.println("India");
        return 5;
    }
    public static void main(String[] args) {
        hello();
        System.out.println("With Return Value: ");
        System.out.println(hello());
    }
}
