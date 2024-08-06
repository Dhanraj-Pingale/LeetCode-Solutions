class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int n = word.length();
       
        int[] arr = new int[26];
        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);
            // hm.put(c, hm.getOrDefault(c, 0) + 1);
            arr[c - 'a'] += 1;
        }

        // int i = 0;
        // for (int freq : hm.values()) {
        //     arr[i] = freq;
        //     i++;
        // }
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