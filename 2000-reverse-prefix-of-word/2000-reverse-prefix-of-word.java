class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        for(int i=0; i<n; i++) {
            char c = word.charAt(i);
            if(c==ch) {
                return reverse(word, ch, i);
            }
        }
        return word;
    }
    public static String reverse(String word, char ch, int idx) {
        int left=0, right=idx;
        char[] arr = word.toCharArray();
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}