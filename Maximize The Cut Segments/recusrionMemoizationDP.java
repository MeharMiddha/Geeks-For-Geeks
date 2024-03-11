class Solution
{
   public static int solveMem(int n,int x,int y,int z,int[] dp){
        if(n==0) return 0;
        if(n<0) return Integer.MIN_VALUE;
        if(dp[n]!=-1) return dp[n];
        int a = solveMem(n-x,x,y,z,dp)+1;
        int b = solveMem(n-y,x,y,z,dp)+1;
        int c = solveMem(n-z,x,y,z,dp)+1;
        
        dp[n]= Math.max(a,Math.max(b,c));
        return dp[n];
    }
    //Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z)
    {
        // Recursion + Memoization
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int ans = solveMem(n,x,y,z,dp);
        if(ans<0) return 0;
        return ans;
    }
}
