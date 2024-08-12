import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); 
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; 
            }

            HashSet<Integer> hs = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int complement = -(nums[i] + nums[j]);
                if (hs.contains(complement)) {
                    ans.add(Arrays.asList(nums[i], nums[j], complement));
                   
                    while (j + 1 < n && nums[j] == nums[j + 1]) {
                        j++;
                    }
                }
                hs.add(nums[j]);
            }
        }

        return ans;
    }
}
