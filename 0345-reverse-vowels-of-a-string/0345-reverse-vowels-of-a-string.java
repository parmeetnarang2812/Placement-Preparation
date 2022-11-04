class Solution {
    
    public boolean isVowel(char[] arr, int i) {
        char ch = arr[i];
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
            return true;
        }
        return false;
    }
    
    public void swap(int i, int j, char[] arr) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left<right) {
            // left -> vowel
            while(left<right && isVowel(arr,left)==false) {
                left++;
            }
            // right -> vowel
            while(left<right && isVowel(arr,right)==false) {
                right--;
            }
            swap(left,right,arr);
            left++;
            right--;
        }
        
        String str = "";
        for(char ch : arr) {
            str += ch;
        }
        return str;
    }
    
}