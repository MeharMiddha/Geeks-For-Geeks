class Solution
{
    public static int solve(int n){
        if(n==0) return 0;
        int ans=n;
        for(int i=1;i*i<=n;i++){
            int temp=i*i;
            ans=Math.min(ans,1+solve(n-temp));
        }
        return ans;
    }
    public int MinSquares(int n)
    {
        // Code here
        return solve(n);
    }
}
