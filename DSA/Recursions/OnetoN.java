package DSA.Recursions;

public class OnetoN {
    public static void main(String[] args) {
        int n=9;
        fun(n);
//        both(n);
    }
    static void fun(int n){
        if(n==0) return;
        fun(n-1);
        System.out.print(n+" ");
    }
    static void both(int n){
        if(n==0) return;
        System.out.print(n+" ");
        both(n-1);
        System.out.print(n+" ");
    }
}
