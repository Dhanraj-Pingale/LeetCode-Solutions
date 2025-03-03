import java.util.ArrayList;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> more = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();

        for (int num : nums) {
            if (num < pivot) {
                less.add(num);
            } else if (num > pivot) {
                more.add(num);
            } else {
                equal.add(num);
            }
        }

        int i = 0;
        for (int num : less) {
            nums[i++] = num;
        }
        for (int num : equal) {
            nums[i++] = num;
        }
        for (int num : more) {
            nums[i++] = num;
        }

        return nums;
    }
}
