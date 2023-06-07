package leetcode._2335

import java.util.*

class Solution {

    fun fillCups(amount: IntArray): Int {
        val queue = PriorityQueue<Int> { a, b -> b - a }

        for (value in amount) {
            if (value != 0) {
                queue.offer(value)
            }
        }

        var output = 0
        while (queue.isNotEmpty()) {
            val value1 = queue.remove() - 1
            val value2 = if (queue.isNotEmpty()) {
                queue.remove() - 1
            } else {
                0
            }
            output++
            if (value1 > 0) {
                queue.offer(value1)
            }
            if (value2 > 0) {
                queue.offer(value2)
            }
        }
        return output
    }
}