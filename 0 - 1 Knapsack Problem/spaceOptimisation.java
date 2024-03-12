class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    public static int spaceOptimisation(int maxWeight,int[] wt,int[] val,int n){
        int[] prev=new int[maxWeight+1];
        int[] curr=new int[maxWeight+1];
        for(int w=wt[0];w<=maxWeight;w++){
            if(wt[0]<=maxWeight){
                prev[w]=val[0];
            }else{
                prev[w]=0;
            }
        }
        for(int i=1;i<=n;i++){
            for(int w=0;w<=maxWeight;w++){
                int include=0;
                if(wt[i]<=w){
                    include=val[i]+prev[w-wt[i]];
                }
                int exclude=0+prev[w];
                curr[w]=Math.max(include,exclude);
            }
            System.arraycopy(curr, 0, prev, 0, maxWeight + 1);
        }
        return prev[maxWeight];
    }
    
    static int knapSack(int W, int wt[], int val[], int n) 
    {   
        // Space Optimisation Approach
        return spaceOptimisation(W,wt,val,n-1);
    } 
}
