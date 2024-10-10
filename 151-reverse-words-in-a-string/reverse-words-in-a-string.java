class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder("");
        int n = s.length();
        int left = n - 1;

        while (left >= 0) {
            while (left >= 0 && s.charAt(left) == ' ') {
                left--;
            }
            if (left < 0) {
                break;
            }
            int right = left;
            while (left >= 0 && s.charAt(left) != ' ') {
                left--;
            }
            sb.append(s.substring(left + 1, right + 1));

            if (left >= 0) {
                sb.append(' ');
            }
        }
        return sb.toString().trim();
    }
}