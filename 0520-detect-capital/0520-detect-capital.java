class Solution {
    public boolean detectCapitalUse(String word) {
        
        // base case
        if(word.length()==1) {
            return true;
        }
        
        char c1 = word.charAt(0);
        char c2 = word.charAt(1);
        
        //parmeet
        if(Character.isLowerCase(c1)) {
            for(int i=1; i<word.length(); i++) {
                if(Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }
        
        //PARMEET
        if(Character.isUpperCase(c1) && Character.isUpperCase(c2)) {
            for(int i=2; i<word.length(); i++) {
                if(!Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }
        
        //Parmeet
        if(Character.isUpperCase(c1) && Character.isLowerCase(c2)) {
            for(int i=2; i<word.length(); i++) {
                if(Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }
        
        return true;
    }
}