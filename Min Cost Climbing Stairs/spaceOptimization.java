class Solution {
    public static int solve3(int[] cost,int n){
        int prev2=cost[0];
        int prev1=cost[1];
        for(int i=2;i<n;i++){
            int current = cost[i]+Math.min(prev1,prev2);
            prev2=prev1;
            prev1=current;
        }
        return Math.min(prev1,prev2);
    }
    
    static int minCostClimbingStairs(int[] cost , int N) {
        return solve3(cost,N);
    }
};
