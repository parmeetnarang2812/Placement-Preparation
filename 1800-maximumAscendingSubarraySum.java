// time : O(N), space : constant
/* 
class Solution {
    public int maxAscendingSum(int[] nums) {
        // not entirely kadane because all nums are +ve so check if nums[i]>nums[i-1] then start from previous 
        // else start from nums[i]
        int currentSum = nums[0];
        int maximumSum = nums[0];
        for(int i=1; i<nums.length; i++) {
            
            if(nums[i]>nums[i-1]) {
                currentSum += nums[i];
            }
            else {
                currentSum = nums[i];
            }

            if(currentSum > maximumSum) {
                maximumSum = currentSum;
            }
        }
        return maximumSum;
    }
}
*/