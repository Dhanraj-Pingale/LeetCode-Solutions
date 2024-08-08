class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        int k = 0;
        
        int r = rStart, c = cStart;
        int step = 1;
        
        result[k++] = new int[] { r, c };
        
        while (k < rows * cols) {
            // Move right
            for (int i = 0; i < step; i++) {
                c++;
                if (c >= 0 && c < cols && r >= 0 && r < rows) {
                    result[k++] = new int[] { r, c };
                }
            }
            
            // Move down
            for (int i = 0; i < step; i++) {
                r++;
                if (c >= 0 && c < cols && r >= 0 && r < rows) {
                    result[k++] = new int[] { r, c };
                }
            }
            
            step++;
            
            // Move left
            for (int i = 0; i < step; i++) {
                c--;
                if (c >= 0 && c < cols && r >= 0 && r < rows) {
                    result[k++] = new int[] { r, c };
                }
            }
            
            // Move up
            for (int i = 0; i < step; i++) {
                r--;
                if (c >= 0 && c < cols && r >= 0 && r < rows) {
                    result[k++] = new int[] { r, c };
                }
            }
            
            step++;
        }
        
        return result;
    }
}
