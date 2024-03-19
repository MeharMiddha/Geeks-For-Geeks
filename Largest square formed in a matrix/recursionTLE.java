class Solution{
    public static int solve(int[][] mat,int i,int j,int maxi){
        if(i>=mat.length || j>=mat[0].length) return 0;
        int right = solve(mat,i,j+1,maxi);
        int diagonal=solve(mat,i+1,j+1,maxi);
        int down=solve(mat,i+1,j,maxi);
        if(mat[i][j]==1){
            int ans = 1+Math.min(right,Math.min(diagonal,down));
            maxi = Math.max(maxi,ans);
            return ans;
        }else{
            return 0;
        }
    }
    
    static int maxSquare(int n, int m, int mat[][]){
        // code here
        int maxi=0;
        maxi=solve(mat,0,0,maxi);
        return maxi;
    }
}
