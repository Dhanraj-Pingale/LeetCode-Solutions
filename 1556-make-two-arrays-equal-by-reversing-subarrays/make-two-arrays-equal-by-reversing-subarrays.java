class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        boolean ans = true;

        for(int i=0; i<target.length; i++){
            if(target[i] != arr[i]){
                ans = false;
                break;
            }
        }

        return ans;
    }
}