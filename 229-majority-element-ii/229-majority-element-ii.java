class Solution {

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int cnt1 = 0, cnt2 = 0, elt1 = -1, elt2 = -1;
        for (int num : nums) {
            if (elt1 == num) {
                cnt1++;
            } else if (elt2 == num) {
                cnt2++;
            } else if (cnt1 == 0) {
                elt1 = num;
                cnt1 = 1;
            } else if (cnt2 == 0) {
                elt2 = num;
                cnt2 = 1;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;
        for (int num : nums) {
            if (num == elt1) {
                cnt1++;
            } else if (num == elt2) {
                cnt2++;
            }
        }

        if (cnt1 > n / 3) {
            ans.add(elt1);
        }
        if (cnt2 > n / 3) {
            ans.add(elt2);
        }

        return ans;
    }
}
