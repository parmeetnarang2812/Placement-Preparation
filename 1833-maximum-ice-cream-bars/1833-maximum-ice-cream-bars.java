class Solution {
    public int maxIceCream(int[] costs, int coins) {
        //base case
        if (coins == 0 || costs == null || costs.length == 0) return 0;

        int n = costs.length;
        int max = 0;
        Arrays.sort(costs);

        // BRUTE
        // [1,1,2,3,4] -> 7-1=6, 6-1=5, 5-2=3, 3-3=0
        // while(coins!=0) {
        //     for(int i=0; i<n; i++) {
        //         if(costs[i]<coins) {
        //             coins -= costs[i];
        //             max++;
        //         }
        //     }
        // }

        // GREEDY -> not much difference from brute, just the loops are avoided using count pointer ;)
        while (max < n && costs[max] <= coins) {
            coins -= costs[max];
            max++;
        }
        return max;
    }
}
