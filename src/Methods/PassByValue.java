package Methods;

public class PassByValue {
    public static void change(int x){
        x = 10;
    }
    public static void main(String[] args) {
        int x = 6;
        System.out.println(x);
        change(6);
        System.out.println(x);
    }
}
