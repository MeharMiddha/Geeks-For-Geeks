class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    public static int solveTab(int maxWeight,int[] wt,int[] val,int n){
        int[][] dp = new int[n+1][maxWeight+1];
        for(int w=wt[0];w<=maxWeight;w++){
            if(wt[0]<=maxWeight){
                dp[0][w]=val[0];
            }else{
                dp[0][w]=0;
            }
        }
        for(int i=1;i<=n;i++){
            for(int w=0;w<=maxWeight;w++){
                int include=0;
                if(wt[i]<=w){
                    include=val[i]+dp[i-1][w-wt[i]];
                }
                int exclude=0+dp[i-1][w];
                dp[i][w]=Math.max(include,exclude);
            }
        }
        return dp[n][maxWeight];
    }
    
    static int knapSack(int W, int wt[], int val[], int n) 
    {  
        // TABULATION APPROACH
        return solveTab(W,wt,val,n-1);
    } 
}
