class Solution {

    public int removeDuplicates(int[] nums) {
        //a pointer to keep the track of previous index
        int pre = 0;

        for (int i = 1; i < nums.length; i++) {
            //if the integer at i'th index is not equal to integer at previous'th index then the condition is satisfied i.e both the integer are different
            if (nums[i] != nums[pre]) {
                //Incresing the previous by one to update its position by 1.
                pre++;

                //Inserting the value at i'th index to the previous'th index
                nums[pre] = nums[i];
            }
        }

        return pre + 1;
    }
}
