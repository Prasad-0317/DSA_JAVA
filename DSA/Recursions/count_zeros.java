package DSA.Recursions;

public class count_zeros {
    // M-1
//    static int cnt=0;
//    static void cnt(int n){
//        if(n==0){
//            cnt=1;
//            return;
//        }
//        if(n%10==n) return;
//        int rem = n%10;
//        if(rem==0) cnt++;
//        cnt(n/10);
//    }

    // M-2 --> IMP PATTERN

    static int cnt(int n){
        return helper(n,0);
    }

    static int helper(int n,int c){
        if(n==0) return c;
        int rem = n%10;
        if(rem == 0){
            return helper(n/10,c+1);
        }
        else{
            return helper(n/10,c);
        }
    }

    public static void main(String[] args) {
        int n = 3020;
//        cnt(n);
        System.out.println(cnt(n));
    }
}
