class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long[] ans = new Long[2];
        Long temp1 = A;
        Long temp2 = B;
        while(temp1%temp2!=0) {
            Long rem = temp1%temp2;
            temp1=temp2;
            temp2=rem;
        }
        ans[1] = temp2; //gcd
        ans[0] = (A*B)/temp2; //lcm=(n1*n2)/gcd
        return ans;
    }
};