class Solution{
    public static int solveMem(int[][] mat, int i, int j, int[][] dp) {
        if (i >= mat.length || j >= mat[0].length) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        int right = solveMem(mat, i, j + 1, dp);
        int diagonal = solveMem(mat, i + 1, j + 1, dp);
        int down = solveMem(mat, i + 1, j, dp);
        if (mat[i][j] == 1) {
            dp[i][j] = 1 + Math.min(right, Math.min(diagonal, down));
            // Update maxi here, instead of returning it directly
            return dp[i][j];
        } else {
            // When mat[i][j] == 0, set dp[i][j] to 0
            return dp[i][j] = 0;
        }
    }    
    static int maxSquare(int n, int m, int mat[][]){
        // Recursion + Memoization
        int[][] dp = new int[n + 1][m + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        // Initialize maxi to 0
        int maxi = 0;
        // Call solveMem with initial parameters
        solveMem(mat, 0, 0, dp);
        // Find the maximum value in dp, which represents the maximum square size
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                maxi = Math.max(maxi, dp[i][j]);
            }
        }
        return maxi;
    }
}
