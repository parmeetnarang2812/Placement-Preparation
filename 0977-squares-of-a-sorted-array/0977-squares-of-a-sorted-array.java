class Solution {

    public int[] sortedSquares(int[] nums) {
        
        int[] res = new int[nums.length];
        int i = 0; // smallest element
        int j = nums.length - 1; // largest element
        int idx = nums.length - 1; // helps in filling in res array

        while (i <= j) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                res[idx] = nums[i] * nums[i];
                i++;
            } else { // condition : nums[i]*nums[i] <= nums[j]*nums[j]
                res[idx] = nums[j] * nums[j];
                j--;
            }
            idx--;
        }

        return res;
    }
    
}
