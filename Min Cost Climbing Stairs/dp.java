class Solution {
    public static int solve(int[] cost,int n,int[] dp){
        if(n==0) return cost[0];
        if(n==1) return cost[1];
        if(dp[n-1]!=-1) return dp[n];
        dp[n]= cost[n]+Math.min(solve(cost,n-1,dp),solve(cost,n-2,dp));
        return dp[n];
    }
    
    static int minCostClimbingStairs(int[] cost , int N) {
        //Write your code here
        int dp[]=new int[N+1];
        Arrays.fill(dp,-1);
        int ans=Math.min(solve(cost,N-1,dp),solve(cost,N-2,dp));
        return ans;
    }
};
