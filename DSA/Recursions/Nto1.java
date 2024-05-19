package DSA.Recursions;

public class Nto1 {
    public static void main(String[] args) {
        int n=9;
        fun(n);
    }
    static void fun(int n){
        System.out.print(n+" ");
        if(n==0) return;
        fun(n-1);
    }
}
