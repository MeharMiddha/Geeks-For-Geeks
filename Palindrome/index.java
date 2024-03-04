class Solution
{
    public String is_palindrome(int n)
    {
        int rev=0;
        int a=n;
        while(a!=0){
            rev=rev*10+a%10;
            a=a/10;
        }
        if(rev==n){
            return "Yes";
        }else{
            return "No";
        }
    }
}
