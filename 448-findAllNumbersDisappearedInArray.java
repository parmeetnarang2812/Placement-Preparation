// time : O(N)+O(N)=O(2N)~O(N),   space : O(1)

/* class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // mark -ve method
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            int val = Math.abs(nums[i])-1;
            if(nums[val]>0)
                nums[val] = -nums[val];
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i]>0) 
                ans.add(i+1);
        }
        return ans;
    }
} */