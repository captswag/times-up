package leetcode._746.solutionconstantspace

import leetcode._746.Solution

class SolutionConstantSpace : Solution {

    override fun minCostClimbingStairs(cost: IntArray): Int {
        var downTwo = 0
        var downOne = 0

        for (index in 2..cost.size) {
            val temp = Math.min(downTwo + cost[index - 2], downOne + cost[index - 1])
            downTwo = downOne
            downOne = temp
        }

        return downOne
    }
}