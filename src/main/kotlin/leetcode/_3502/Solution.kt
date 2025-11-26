package leetcode._3502

class Solution {

    fun minCosts(cost: IntArray): IntArray {
        for (index in 1 until cost.size) {
            cost[index] = Math.min(cost[index], cost[index - 1])
        }
        return cost
    }
}