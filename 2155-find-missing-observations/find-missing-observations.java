class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sumM = 0;
        int m = rolls.length;
        for(int roll : rolls) {
            sumM += roll;
        }

        int totalNum = m + n;
        int sumN = (mean * totalNum) - sumM;

        if(sumN < n || sumN > n * 6) {
            return new int[] {};
        }

        int[] ans = new int[n];
        int baseValue = sumN / n;
        int remainder = sumN % n;

        for (int i = 0; i < n; i++) {
            ans[i] = baseValue + (i < remainder ? 1 : 0);
        }

        return ans;
    }
}
