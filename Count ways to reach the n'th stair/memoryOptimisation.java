class Solution
{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        
        // your code here
        if (n == 0 || n == 1) {
            return 1;
        }
        int prev1=1;
        int prev2=1;
        for(int i=2;i<=n;i++){
            int current=(prev1+prev2)%1000000007;
            prev1=prev2;
            prev2=current;
        }
        return prev2;
    }
}

