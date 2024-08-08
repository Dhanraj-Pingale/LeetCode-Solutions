import java.util.PriorityQueue;

class Solution {
    public int rangeSum(int[] nums, int n, int l, int r) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int mod = 1000000007;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += nums[j];
                minHeap.offer(currentSum);
            }
        }

        for (int i = 1; i <= r; i++) {
            int smallestSum = minHeap.poll();
            if (i >= l) {
                sum = (sum + smallestSum) % mod;
            }
        }

        return sum;
    }
}
