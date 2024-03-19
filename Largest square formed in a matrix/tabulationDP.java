class Solution{  
    public static int solveTab(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int dp[][] = new int[row + 1][col + 1];
        int maxi = 0; // Initialize maxi here
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                int right = dp[i][j + 1];
                int diagonal = dp[i + 1][j + 1];
                int down = dp[i + 1][j];
                if (mat[i][j] == 1) {
                    dp[i][j] = 1 + Math.min(right, Math.min(diagonal, down));
                    maxi = Math.max(maxi, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return maxi; // Return maxi here
    }
    
    static int maxSquare(int n, int m, int mat[][]){
        // Recursion + Tabulation
        return solveTab(mat);
        
    }
}
