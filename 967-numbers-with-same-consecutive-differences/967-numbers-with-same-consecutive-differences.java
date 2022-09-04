class Solution {

    public int count(int num) {
        int cnt = 0;
        while (num > 0) {
            cnt++;
            num /= 10;
        }
        return cnt;
    }

    public void findNumber(int num, int n, int k, List<Integer> ans) {
        if (count(num) == n) {
            ans.add(num);
            return;
        }
        for (int i = 0; i <= 9; i++) {
            int lastDigit = num % 10;
            if (Math.abs(lastDigit - i) == k) {
                int number = num * 10 + i;
                findNumber(number, n, k, ans);
            }
        }
    }

    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            findNumber(i, n, k, ans);
        }
        
        int len = ans.size();
        int[] arr  = new int[len];
        for(int i=0; i<len; i++)arr[i] = ans.get(i);
        return arr;
    }
    
}
