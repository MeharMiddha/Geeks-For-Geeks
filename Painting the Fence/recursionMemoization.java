class Solution
{
    static final int MOD = 1000000007;
    public static long add(long a, long b) {
        return (((a + b) % MOD));
    }

    public static long mul(long a, long b) {
        return (((a * b) % MOD));
    }
    public static long solveMem(int n,int k,long[] dp){
        if(n==1) return k;
        if(n==2) return add(k,mul(k,k-1));
        if(dp[n]!=-1) return dp[n];
        dp[n] = add(mul(solveMem(n-2,k,dp),k-1),mul(solveMem(n-1,k,dp),k-1));
        return dp[n];
    }
    
    long countWays(int n,int k)
    {
        // Recursion + Memoization
        long dp[]=new long[n+1];
        Arrays.fill(dp,-1);
        return solveMem(n,k,dp);
    }
}
