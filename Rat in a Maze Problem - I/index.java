class Solution {
    
    public static boolean isSafe(int x, int y, int n, int[][] visited, int[][] m) {
        return (x >= 0 && x < n) && (y >= 0 && y < n) && visited[x][y] == 0 && m[x][y] == 1;
    }

    public static void solve(int[][] m, int n, ArrayList<String> ans, int x, int y, int[][] visited, StringBuilder path) {
        if (x == n - 1 && y == n - 1) {
            ans.add(path.toString());
            return;
        }
        visited[x][y] = 1;

        // 4 choices: Down, Left, Right, Up

        // Down
        int newx = x + 1;
        int newy = y;
        if (isSafe(newx, newy, n, visited, m)) {
            path.append('D');
            solve(m, n, ans, newx, newy, visited, path);
            path.deleteCharAt(path.length() - 1);
        }
        
        // Left
        newx = x;
        newy = y-1;
        if (isSafe(newx, newy, n, visited, m)) {
            path.append('L');
            solve(m, n, ans, newx, newy, visited, path);
            path.deleteCharAt(path.length() - 1);
        }
        // Right
        newx = x;
        newy = y+1;
        if (isSafe(newx, newy, n, visited, m)) {
            path.append('R');
            solve(m, n, ans, newx, newy, visited, path);
            path.deleteCharAt(path.length() - 1);
        }
        // Up
        newx = x-1;
        newy = y;
        if (isSafe(newx, newy, n, visited, m)) {
            path.append('U');
            solve(m, n, ans, newx, newy, visited, path);
            path.deleteCharAt(path.length() - 1);
        }

        visited[x][y] = 0;
    }

    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
        if (m[0][0] == 0) return ans;
        int srcx = 0, srcy = 0;
        int[][] visited = new int[n][n];
        StringBuilder path = new StringBuilder();
        solve(m, n, ans, srcx, srcy, visited, path);
        Collections.sort(ans);
        return ans;
    }
}
