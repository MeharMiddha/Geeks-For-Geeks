class Solution 
{
  public static int solveMem(int size, int[] a, int curr, int prev, int[][] dp) {
        if (curr == size) return 0;
        if (dp[curr][prev + 1] != -1) return dp[curr][prev + 1];
        // Include
        int take = 0;
        if (prev == -1 || a[curr] > a[prev]) {
            take = 1 + solveMem(size, a, curr + 1, curr, dp);
        }

        // Not Include
        int notTake = 0 + solveMem(size, a, curr + 1, prev, dp);

        return dp[curr][prev + 1] = Math.max(take, notTake);
    }
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int a[])
    {
        // Recursion + Memoization
        int[][] dp = new int[size][size+1];
        for(int[] row:dp) Arrays.fill(row,-1);
        return solveMem(size,a,0,-1,dp);
    }
} 
