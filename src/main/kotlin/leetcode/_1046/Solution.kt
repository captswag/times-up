package leetcode._1046

import java.util.*

class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        val maxQueue = PriorityQueue<Int> { a, b -> b - a }

        for (stone in stones) {
            maxQueue.offer(stone)
        }

        while (maxQueue.size > 1) {
            val diff = maxQueue.poll() - maxQueue.poll()
            if (diff != 0) {
                maxQueue.offer(diff)
            }
        }

        return if (maxQueue.isNotEmpty()) {
            maxQueue.poll()
        } else {
            0
        }
    }
}