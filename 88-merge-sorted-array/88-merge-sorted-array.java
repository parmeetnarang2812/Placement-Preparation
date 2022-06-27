class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=nums1.length-1, j=0;
        while(j<nums2.length) {
            if(nums2[j] > nums1[i] || nums1[i]==0) {
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
            }
            i--;
            j++;
        }
        Arrays.sort(nums1);
    }
}