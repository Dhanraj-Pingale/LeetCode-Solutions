import java.util.HashMap;

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for (int num : target) {
            if (!hm.containsKey(num) || hm.get(num) == 0) {
                return false;
            }
            hm.put(num, hm.get(num) - 1);
        }

        for (int count : hm.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
