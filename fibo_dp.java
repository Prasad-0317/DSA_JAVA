import java.util.Arrays;

public class factorial_dp {
    static int fact(int n, int[] dp){
        if(n <= 1) return n;
        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = 
    }
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[1] = 1;

    }
}
