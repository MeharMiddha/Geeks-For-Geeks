class Solution {
    public static int solve(int arr[],int n){
        if(n<0) return 0;
        if(n==0) return arr[0];
        int include = solve(arr,n-2)+arr[n];
        int exclude = solve(arr,n-1)+0;
        return Math.max(include,exclude);
    }
    
    int findMaxSum(int arr[], int n) {
        // code here
        return solve(arr,n-1);
    }
}
