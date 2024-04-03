class Solution 
{
    public static int solve(int size,int[] a,int curr,int prev){
        if(curr == size) return 0;
        
        // Include
        int take=0;
        if(prev == -1 || a[curr] > a[prev]){
            take = 1 + solve(size,a,curr+1,curr);
        }
        
        // Not Include
        int notTake = 0 + solve(size,a,curr+1,prev);
        
        return Math.max(take,notTake);
    }
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int a[])
    {
        // code here
        return solve(size,a,0,-1);
    }
} 
