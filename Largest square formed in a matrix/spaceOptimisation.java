class Solution{
    public static int solveSpaceOptimisation(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[] curr = new int[col + 1];
        int[] next = new int[col + 1];
        int maxi = 0; // Initialize maxi here
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                int right = curr[j + 1];
                int diagonal = next[j + 1];
                int down = next[j];
                if (mat[i][j] == 1) {
                    curr[j] = 1 + Math.min(right, Math.min(diagonal, down));
                    maxi = Math.max(maxi, curr[j]);
                } else {
                    curr[j] = 0;
                }
            }
            // Perform deep copy from curr to next
            System.arraycopy(curr, 0, next, 0, col + 1);
        }
        return maxi; // Return maxi here
    }
    
    static int maxSquare(int n, int m, int mat[][]){
        // Space Optimisation
        return solveSpaceOptimisation(mat);
        
    }
}
