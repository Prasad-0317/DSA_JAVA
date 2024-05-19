package DSA.Recursions;

public class sum_of_digits_products {
    public static void main(String[] args) {
        int  n = 301;
//        int ans = sum(n);
        int ans = product(n);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n==0) return 0;
        return (n%10) + sum(n/10);
    }
    static int product(int n){
//        if(n%10==n) return n;
        if(n==0) return 1;
        return (n%10) * product(n/10);
    }
}
