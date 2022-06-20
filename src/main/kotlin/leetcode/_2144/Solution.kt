package leetcode._2144

import java.util.*

class Solution {
    fun minimumCost(cost: IntArray): Int {
        Arrays.sort(cost)
        var output = 0
        var counter = 0
        for (index in cost.size - 1 downTo 0) {
            if (counter == 2) {
                counter = 0
            } else {
                output += cost[index]
                counter++
            }
        }
        return output
    }
}