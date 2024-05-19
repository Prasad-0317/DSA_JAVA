package DSA.Recursions;

public class reverse_number {
//    static int sum =0;
//    static void rev2(int n){
//        if(n==0) return;
//        int rem=n%10;
//        sum = sum*10 + rem;
//        rev2(n/10);
//    }
    static int rev3(int n){
        int digits = (int) (Math.log10(n)+1);
        return helper(n,digits);
    }
    static int helper(int n, int digits){
        if(n%10 ==n) return n;
        int rem = n%10;
        return rem*(int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }
    static boolean palin(int n){
        return n==rev3(n);
    }
    public static void main(String[] args) {
        int n = -121;
//        rev2(n);
//        System.out.println(sum);
        System.out.println(rev3(n));
        System.out.println(palin(n));
    }
    // Method mine
//     static void rev1(int n){
//        if(n==0) return;
//        System.out.print(n%10);
//        rev1(n/10);
//    }
//    Method 2

}
