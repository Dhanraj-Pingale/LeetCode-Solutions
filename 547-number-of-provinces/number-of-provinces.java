class Solution {
    public void dfsUtil(int[][] matrix, boolean[] visited, int curr) {
        visited[curr] = true;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[curr][i] == 1 && !visited[i]) { 
                dfsUtil(matrix, visited, i);
            }
        }
    }

    public int dfs(int[][] matrix) {
        int count = 0;
        boolean[] visited = new boolean[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            if (!visited[i]) {  
                count++;
                dfsUtil(matrix, visited, i);
            }
        }

        return count;
    }

    public int findCircleNum(int[][] isConnected) {
        return dfs(isConnected);
    }
}
