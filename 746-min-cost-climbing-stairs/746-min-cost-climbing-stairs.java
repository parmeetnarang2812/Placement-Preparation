class Solution {

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        return climb_mem(n, cost, dp);
    }

    public int climb_mem(int N, int[] cost, int[] dp) {
        for(int n=0; n<=N; n++) {
            if (n <= 1) {
            dp[n] = cost[n];
            continue;
        }

        dp[n] = Math.min(dp[n-1], dp[n-2]) + (n == cost.length ? 0 : cost[n]);
        }
        return dp[N];
    }
}
