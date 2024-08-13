import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }


        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

     
        int[][] result = new int[intervals.length][2];
        int j = 0;

        for (int i = 0; i < intervals.length; i++) {
            if (j == 0 || result[j-1][1] < intervals[i][0]) {
                result[j++] = intervals[i];
            } else {
             
                result[j-1][1] = Math.max(result[j-1][1], intervals[i][1]);
            }
        }

        return Arrays.copyOf(result, j);
    }
}
