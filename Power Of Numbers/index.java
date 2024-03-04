class Solution
{
        
    long power(int N,int R)
    {
        //Your code here
        if(R==0) return 1;
        if(R==1) return N;
        long temp=power(N,R/2)%1000000007;
        temp=(temp*temp)%1000000007;
        if(R%2==0)
            return temp%1000000007;
        else 
            return N*temp%1000000007;
        
    }

}
