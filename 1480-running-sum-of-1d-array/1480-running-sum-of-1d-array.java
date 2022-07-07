class Solution {

    public int[] runningSum(int[] nums) {
        // nums[0] will remain same, so iterating from index 1
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
    
}
