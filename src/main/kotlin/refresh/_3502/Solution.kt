package refresh._3502

import kotlin.math.min

class Solution {

    fun minCosts(cost: IntArray): IntArray {
        for (i in 1 until cost.size) {
            cost[i] = min(cost[i], cost[i - 1])
        }

        return cost
    }
}