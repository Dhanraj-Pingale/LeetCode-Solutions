class Solution {
    public int minimumCost(int[] nums) {
        int first = nums[0];
        int small = Integer.MAX_VALUE;
        int small2 = Integer.MAX_VALUE;

        for(int i=1; i<nums.length; i++){
            if(nums[i] < small){
                small2 = small;
                small = nums[i];
            }
            else if(nums[i] < small2){
                small2 = nums[i];
            }
        }
        int minCost = first + small + small2;

        return minCost;        
    }
}