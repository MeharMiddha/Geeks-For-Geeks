class Solution {
    public static int solveSpaceOptimisation(int arr[]){
        int n = arr.length;
        int prev2=0;
        int prev1=arr[0];
        for (int i=1;i<n;i++){
            int include = prev2+arr[i];
            int exclude = prev1+0;
            int ans=Math.max(include,exclude);
            prev2=prev1;
            prev1=ans;
        }
        return prev1;
    }
    
    int findMaxSum(int arr[], int n) {
        // SPACE OPTIMISATION
        return solveSpaceOptimisation(arr);
    }
}
