// time : O(N), space : O(1)

// In question it is mentioned that element are strictly increasing. we can use this info to find kth missing element.
// let's take example where suppose every element in missing i.e. an empty array is passed.
// 1,2,3,4,5,6,7.....
// so if k=1 answer is 1 , for k=2 answer is 2. and k=5 answer is 5
// but now suppose input array is arr=[3]. so for k=5. our answer is 6 i.e(missing list - 1,2,4,5,6,7......)
// so, we can observe that more the elements comes before k in arr the same number of times k will shift also. if 2 and 4 is input array and for k=5 ouput would be 7.
// but if k asked is lo less that every element is missing with in k range. k is the output.
// why? for example - arr=[4,6]
// k=3, output=3
// k=2,ouput=2
// k=4, here 4 comes in between our missing element range from 1,4 hence k shifts one time and ouput will be 5.
// apply above logic in a single loop. and answer will be k.


/* class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i]<=k) {
                k++;
            }
            else {
                break;
            }
        }
        return k;
    }
} */