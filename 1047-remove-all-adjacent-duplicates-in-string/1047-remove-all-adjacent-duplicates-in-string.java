class Solution {

    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack();

        //iterate over string
        for (char ch : S.toCharArray()) {
            //check if top of stack is equal to this character
            if (!stack.isEmpty() && stack.peek() == ch) {
                //remove
                stack.pop();
            } else {
                //add to stack
                stack.push(ch);
            }
        }

        //string builder for result
        StringBuilder sb = new StringBuilder();

        //empty stack out (everything left is not an adjacent duplicate)
        while (!stack.isEmpty()) sb.append(stack.pop());

        //result
        return sb.reverse().toString();
    }
}
