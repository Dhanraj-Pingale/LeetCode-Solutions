class Solution {
    public int reverse(int x) {
        int n = Math.abs(x);
        int m = 0;
        int sum = 0;
        while(n>0){
            m = n%10;
            if(sum > (Integer.MAX_VALUE - m)/10){
                return 0;
            }
            sum = sum * 10 + m;
            n /= 10;
        }
        return (x>0)?sum:(-sum);
    }
}