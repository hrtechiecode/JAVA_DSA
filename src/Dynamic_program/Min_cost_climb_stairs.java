package Dynamic_program;

import java.util.Arrays;

public class Min_cost_climb_stairs {
    int[] dp;

    public int mincost(int[] cost, int idx) {
        if (idx >= cost.length) return 0; //  base case: no cost beyond stairs
        if (dp[idx] != -1) return dp[idx]; //  memoization
        return dp[idx] = cost[idx] + Math.min(mincost(cost, idx + 1), mincost(cost, idx + 2));
    }

    public int mincostclimbstairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(mincost(cost, 0), mincost(cost, 1)); //  start from 0 or 1
    }

    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        Min_cost_climb_stairs m = new Min_cost_climb_stairs();
        System.out.println(m.mincostclimbstairs(cost)); // Output: 6
    }
}
