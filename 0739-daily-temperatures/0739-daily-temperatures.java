// time and space is both O(N) -> one loop and one stack is used.
class Solution {

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();  
        int[] ans = new int[temperatures.length];

        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!st.empty() && temperatures[st.peek()] <= temperatures[i]) { 
                //if element(temperatures[idx]) at top is less than current element(temperatures[current_idx])
                st.pop();   //then pop
            }
            if (!st.empty()) {
                ans[i] = st.peek() - i; //storing difference of indices in array 
            }
            st.push(i); //pushing indices in stack
        }

        return ans;
    }
    
}
