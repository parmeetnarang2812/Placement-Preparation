class Solution {

    public int reverse(int x) {
        int n = Math.abs(x);
        int rev = 0;
        while (n > 0) {
            if (rev > 214748364 || rev < -214748364) {
                return 0;
            }
            int r = n % 10;
            n /= 10;
            rev = (rev * 10) + r;
        }
        if (x < 0) {
            return Integer.parseInt("-" + rev);
        } else {
            return rev;
        }
    }
}
