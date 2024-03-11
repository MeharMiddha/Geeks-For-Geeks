class Solution
{
    public static int solve(int n,int x,int y,int z){
        if(n==0) return 0;
        if(n<0) return Integer.MIN_VALUE;
        int a = solve(n-x,x,y,z)+1;
        int b = solve(n-y,x,y,z)+1;
        int c = solve(n-z,x,y,z)+1;
        
        return Math.max(a,Math.max(b,c));
    }
    //Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z)
    {
       //Your code here
       int ans = solve(n,x,y,z);
       if(ans<0) return 0;
       return ans;
    }
}
