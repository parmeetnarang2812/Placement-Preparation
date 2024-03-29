class Solution {

    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2) { // base case
            return nums.length;
        }

        int prev = nums[1] - nums[0];
        int count = prev != 0 ? 2 : 1;

        for (int i = 2; i < nums.length; i++) {
            int curr = nums[i] - nums[i - 1];
            if ((prev >= 0 && curr < 0) || (prev <= 0 && curr > 0)) {
                count++;
                prev = curr;
            }
        }

        return count;
    }
}
