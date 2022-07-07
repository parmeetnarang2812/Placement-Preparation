class Solution {

    public int longestConsecutive(int[] nums) {
        int len = 0;

        Set<Integer> set = new HashSet<>();
        for (int i : nums) set.add(i);

        for (int i : nums) {
            int max = 1, preVal = i - 1, postVal = i + 1;
            while (set.contains(preVal)) {
                max++;
                set.remove(preVal--);
            }
            while (set.contains(postVal)) {
                max++;
                set.remove(postVal++);
            }
            len = Math.max(len, max);
        }
        return len;
    }
    
}
