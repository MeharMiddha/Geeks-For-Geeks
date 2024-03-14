class Solution
{
    public static int solveTab(int n){
        int dp[]=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j*j<=n;j++){
                int temp=j*j;
                if(i-temp>=0){
                    dp[i]=Math.min(dp[i],1+dp[i-temp]);
                }
            }
        }
        return dp[n];
    }
    public int MinSquares(int n)
    {        
        return solveTab(n);
    }
