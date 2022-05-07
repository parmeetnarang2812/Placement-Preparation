/*                                     Chocolate Distribution Problem 
                                    Easy Accuracy: 53.25% Submissions: 44855 Points: 2

Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. 
Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.

Example 1:
    Input:
    N = 8, M = 5
    A = {3, 4, 1, 9, 56, 7, 9, 12}
    Output: 6
    Explanation: The minimum difference between 
    maximum chocolates and minimum chocolates 
    is 9 - 3 = 6 by choosing following M packets :
    {3, 4, 9, 7, 9}.

Example 2:
    Input:
    N = 7, M = 3
    A = {7, 3, 2, 4, 9, 12, 56}
    Output: 2
    Explanation: The minimum difference between
    maximum chocolates and minimum chocolates
    is 4 - 2 = 2 by choosing following M packets :
    {3, 2, 4}.

Expected Time Complexity: O(N*Log(N))
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 105
1 ≤ Ai ≤ 109
1 ≤ M ≤ N 
*/

/*  my gfg soln -> T.C./S.C. = O(nlogn)/O(1) 
class Solution {
    public long findMinDiff(ArrayList<Long> a, long n, long m) {
        // your code here
        Collections.sort(a);    //O(nlogn)
        long min = Integer.MAX_VALUE;

        for (int i = 0; i <= (int) n; i++) {    //O(n)
            long minw = a.get(i);
            long maxw = a.get(i + (int) m - 1);
            long diff = maxw - minw;

            if (diff < min) {
                min = diff;
            }
        }
        return min;
    }
} 
*/