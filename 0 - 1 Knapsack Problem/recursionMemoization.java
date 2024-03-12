class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    public static int solveMem(int capacity,int[] wt,int[] val,int index,int[][] dp){
        if(index==0){
            if(wt[0]<=capacity){
                return val[0];
            }else{
                return 0;
            }
        }
        if(dp[index][capacity]!=-1) return dp[index][capacity];
        int include=0;
        if(wt[index]<=capacity){
            include=val[index]+solveMem(capacity-wt[index],wt,val,index-1,dp);
        }
        int exclude=0+solveMem(capacity,wt,val,index-1,dp);
        dp[index][capacity]= Math.max(include,exclude);
        return dp[index][capacity];
    }
    
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        // Recursion + Memoization
        int dp[][]=new int[n][W+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solveMem(W,wt,val,n-1,dp);
    } 
}
