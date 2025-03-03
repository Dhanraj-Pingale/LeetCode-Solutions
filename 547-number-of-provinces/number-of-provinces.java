class Solution {

    public ArrayList<ArrayList<Integer>> toList(int[][] matrix) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n = matrix.length;

        // initialize the empty arraylists in the main arraylist
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    list.get(i).add(j);
                }
            }
        }
        return list;
    }

    public void dfsUtil(ArrayList<ArrayList<Integer>> list, boolean[] visited, int curr) {
        visited[curr] = true;

        for (int dest : list.get(curr)) {
            if (!visited[dest]) {
                dfsUtil(list, visited, dest);
            }
        }
    }

    public int dfs(ArrayList<ArrayList<Integer>> list) {
        int count = 0;
        boolean[] visited = new boolean[list.size()];

        for (int i = 0; i < list.size(); i++) {
            if(!visited[i]){
                count++;
                dfsUtil(list, visited, i);
            }
        }

        return count;
    }

    public int findCircleNum(int[][] isConnected) {
        return dfs(toList(isConnected));
    }
}