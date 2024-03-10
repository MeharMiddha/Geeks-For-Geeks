class Solution {
    public static int solve2(int[] cost,int n){
        int dp[]=new int[n+1];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<n;i++){
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
    
    static int minCostClimbingStairs(int[] cost , int N) {
        return solve2(cost,N);
    }
};
