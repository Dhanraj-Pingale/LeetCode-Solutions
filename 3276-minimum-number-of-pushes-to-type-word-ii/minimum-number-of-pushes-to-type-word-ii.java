class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int n = word.length();

        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        int[] arr = new int[hm.size()];
        int i = 0;
        for (int freq : hm.values()) {
            arr[i] = freq;
            i++;
        }
        Arrays.sort(arr);
        int ans = 0;
        int count = 0;
        for (int j = arr.length - 1; j >= 0; j--) {
            if (count < 8) {
                ans += arr[j];
            } else if (count < 16) {
                ans += (2 * arr[j]);
            } else if (count < 24) {
                ans += (3 * arr[j]);
            } else {
                ans += (4 * arr[j]);
            }
            count++;
        }

        return ans;
    }
}