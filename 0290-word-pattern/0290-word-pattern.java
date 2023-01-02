class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" "); 
        char[] ch = new char[pattern.length()]; 
        for(int i = 0; i < pattern.length(); i++) {
        // Load pattern characters into ch thus making char array     without java  library.
            ch[i] = pattern.charAt(i);
        }
      
        if(ch.length != words.length) {
            // Check the lengths of the two arrays, if they are not equals return false.
            return false;
        }
        
        HashMap <Character, String> map = new HashMap(); 
        // Set HashMap so we can assign characters from ch array to be keys of values from the words array.
       
        for(int i = 0; i < words.length; i++) {
            // Move through words length, (that are the same length of ch)!
            char Character = ch[i]; // For better readability, mark the elements of the arrays.
            String word = words[i];
            if(!map.containsKey(Character) && !map.containsValue(word)) {
                // If both the key and the value does not exist, create them.
                map.put(Character, word);
            }
            
            if((!map.containsKey(Character) && map.containsValue(word)) || (!map.get(Character).equals(word))) {
// If by any chance the key does not exist but the value does, or when we check if the character equals to the assign value we get false, thats mean that we got unmatching keys or values.
                return false;
            }
        }
        return true;    	
    } 
}