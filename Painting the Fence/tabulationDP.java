class Solution
{
    static final int MOD = 1000000007;
    public static long add(long a, long b) {
        return (((a + b) % MOD));
    }

    public static long mul(long a, long b) {
        return (((a * b) % MOD));
    }
    public static long solveTab(int n,int k){
        if(n==1) return k;
        if(n==2) return add(k,mul(k,k-1));
	    long dp[]=new long[n+1];
		Arrays.fill(dp,0);
		dp[1]=k;
		dp[2]=add(k,mul(k,k-1));
		for(int i=3;i<=n;i++){
			dp[i]=add(mul(dp[i-2],k-1),mul(dp[i-1],k-1));
		}
		return dp[n];
	}
    long countWays(int n,int k)
    {
       
        // Tabulation Approach
        return solveTab(n,k);
    }
}
