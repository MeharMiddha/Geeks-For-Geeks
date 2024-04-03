class Solution 
{   
    public static int solveSpaceOptimised(int size, int[] a) {
        int currRow[]=new int[size+1];
        int nextRow[]=new int[size+1];
        for(int curr=size-1;curr>=0;curr--){
            for(int prev=curr-1;prev>=-1;prev--){
                int take=0;
                if(prev == -1 || a[curr] > a[prev]){
                    take = 1+nextRow[curr+1];
                }
                int notTake = 0 + nextRow[prev+1];
                currRow[prev+1] = Math.max(take,notTake);
            }
            nextRow=currRow.clone();
        }
        return nextRow[0];
    }
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int a[])
    {   
        // Space Optimisation Approach
        return solveSpaceOptimised(size,a);
    }
} 
