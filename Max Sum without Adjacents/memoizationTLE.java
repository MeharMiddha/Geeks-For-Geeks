class Solution {
    public static int solveMem(int arr[],int n,int dp[]){
        if(n<0) return 0;
        if(n==0) return arr[0];
        if(dp[n]!=-1) return dp[n];
        int include = solve(arr,n-2)+arr[n];
        int exclude = solve(arr,n-1)+0;
        dp[n]=Math.max(include,exclude);
        return dp[n];
    }
    
    int findMaxSum(int arr[], int n) {
        // Recursion + Memoization
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return solveMem(arr,n-1,dp);
    }
}
