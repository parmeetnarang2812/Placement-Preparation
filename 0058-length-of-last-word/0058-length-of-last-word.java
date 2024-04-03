class Solution {

    public int lengthOfLastWord(String s) {
        if(s.length()==1) {
            return 1;
        }
        String[] arr = s.split(" ");
        int n = arr.length;
        String str1 = arr[n - 1];
        String str2 = arr[n - 2];
        int count = 0;

        if (str1.equals(" ")) {
            for (int i = 0; i < str2.length(); i++) {
                count++;
            }
        } else {
            for (int i = 0; i < str1.length(); i++) {
                count++;
            }
        }

        return count;
    }
}
