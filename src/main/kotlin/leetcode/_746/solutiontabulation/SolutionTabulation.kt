package leetcode._746.solutiontabulation

import leetcode._746.Solution

class SolutionTabulation : Solution {

    override fun minCostClimbingStairs(cost: IntArray): Int {
        val dp = IntArray(cost.size + 1)
        dp[0] = 0
        dp[1] = 0

        for (index in 2..cost.size) {
            dp[index] = Math.min(dp[index - 2] + cost[index - 2], dp[index - 1] + cost[index - 1])
        }

        return dp[cost.size]
    }
}