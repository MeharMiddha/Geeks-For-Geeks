class Solution 
{
    public static int solveTab(int size, int[] a) {
        int[][] dp = new int[size+1][size+1];
        for(int curr=size-1;curr>=0;curr--){
            for(int prev=curr-1;prev>=-1;prev--){
                int take=0;
                if(prev == -1 || a[curr] > a[prev]){
                    take = 1+dp[curr+1][curr+1];
                }
                int notTake = 0 + dp[curr+1][prev+1];
                dp[curr][prev+1] = Math.max(take,notTake);
            }
        }
        return dp[0][0];
    }
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int a[])
    {
       
        // Tabulation Approach
        return solveTab(size,a);
    }
} 
