class Solution {

    public int pivotIndex(int[] nums) {
        int leftSum = 0, rightSum = 0;
        for (int i : nums) rightSum += i;
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (rightSum == leftSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
