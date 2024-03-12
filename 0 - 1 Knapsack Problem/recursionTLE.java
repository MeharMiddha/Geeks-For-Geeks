class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    public static int solve(int capacity,int[] wt,int[] val,int index){
        if(index==0){
            if(wt[0]<=capacity){
                return val[0];
            }else{
                return 0;
            }
        }
        int include=0;
        if(wt[index]<capacity){
            include=val[index]+solve(capacity-wt[index],wt,val,index-1);
        }
        int exclude=0+solve(capacity,wt,val,index-1);
        return Math.max(include,exclude);
    }
    
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         return solve(W,wt,val,n-1);
    } 
}
