class Solution
{
    static final int MOD = 1000000007;
    public static long add(long a, long b) {
        return (((a + b) % MOD));
    }

    public static long mul(long a, long b) {
        return (((a * b) % MOD));
    }
    
    public static long solve(int n,int k){
        if(n==1) return k;
        if(n==2) return add(k,mul(k,k-1));
        long ans = add(mul(solve(n-2,k),k-1),mul(solve(n-1,k),k-1));
        return ans;
    }
    public static long solveMem(int n,int k){
        
    }
    
    long countWays(int n,int k)
    {
        //code here.
        // Recursion
        // return solve(n,k);
        
        // Recursion + Memoization
    }
}
