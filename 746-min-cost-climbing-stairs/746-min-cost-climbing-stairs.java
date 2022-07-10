class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        return minCostClimbingStairs_optimiztion(n,cost);
    }

    public int minCostClimbingStairs_optimiztion(int N, int[] cost) {
        int one = 0, two = 0;
        for (int i=0;i<N;i++){
            int current = Math.min(one, two) + cost[i];
            one = two;
            two = current;
        }  
        return Math.min(one, two);
    }
}