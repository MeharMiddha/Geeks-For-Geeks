class Solution {
    
    public static int solve(int n,int dp[]){
        if(n==0 || n==1) return n;
        if(dp[n]!=-1) return dp[n];
        dp[n]=(solve(n-1,dp)+solve(n-2,dp))%1000000007;
        return dp[n];
    }
    
    static int nthFibonacci(int n){
        // code here
        int dp[]=new int[n+2];
        for(int i=0;i<=n+1;i++){
            dp[i]=-1;
        }
        return solve(n,dp);
    }
}
