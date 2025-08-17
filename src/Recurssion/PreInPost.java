package Recurssion;

public class PreInPost {
    public static void main(String[] args) {
        pip(3);
    }

    public static void pip(int n) {
        if(n==0) return;
        System.out.print("pre " + n + " "); // pre
        pip(n-1);
        System.out.print("in " + n + " "); // in
        pip(n-1);
        System.out.print("post " + n + " ");// post
    }
}
