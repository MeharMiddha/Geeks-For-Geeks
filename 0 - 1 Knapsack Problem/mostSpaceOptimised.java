class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    public static int moreSpaceOptimisation(int maxWeight,int[] wt,int[] val,int n){
        int[] curr = new int[maxWeight+1];
        for(int w=wt[0];w<=maxWeight;w++){
            if(wt[0]<=maxWeight){
                curr[w]=val[0];
            }else{
                curr[w]=0;
            }
        }
        for(int i=1;i<=n;i++){
            for(int w=maxWeight;w>=0;w--){
                int include=0;
                if(wt[i]<=w){
                    include=val[i]+curr[w-wt[i]];
                }
                int exclude=0+curr[w];
                curr[w]=Math.max(include,exclude);
            }
        }
        return curr[maxWeight];
    }
    
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        // More Space Optimisation Approach
        return moreSpaceOptimisation(W,wt,val,n-1);
    } 
}
