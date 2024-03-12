class Solution
{
    static final int MOD = 1000000007;
    public static long add(long a, long b) {
        return (((a + b) % MOD));
    }

    public static long mul(long a, long b) {
        return (((a * b) % MOD));
    }
	public static long solveSP(int n,int k){
        if(n==1) return k;
        if(n==2) return add(k,mul(k,k-1));
	    long prev2=k;
	    long prev1=add(k,mul(k,k-1));
		for(int i=3;i<=n;i++){
			long ans=add(mul(prev2,k-1),mul(prev1,k-1));
			prev2=prev1;
			prev1=ans;
		}
		return prev1;
	}
    long countWays(int n,int k)
    {   
        // Space Optimisation Approach
        return solveSP(n,k);
    }
}

