class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0 ; i<nums.length; i++){
            hm.put(nums[i], i);
        }

        for(int i=0; i< nums.length; i++){
            int req = target - nums[i];
            if(hm.containsKey(req) && hm.get(req) != i){
                return new int[] {i,hm.get(req)};
            }
        }

        return new int[] {};
    }
}