package leetcode._1619

import java.util.*

class Solution {
    fun trimMean(arr: IntArray): Double {
        val k = arr.size / 20

        val minQueue = PriorityQueue<Int>() // Contains the max k values
        val maxQueue = PriorityQueue<Int> { a, b -> b - a } // Contains the min k values

        var sum = 0
        for (num in arr) {
            sum += num
            minQueue.offer(num)
            maxQueue.offer(num)

            if (minQueue.size > k) {
                minQueue.poll()
            }
            if (maxQueue.size > k) {
                maxQueue.poll()
            }
        }

        while (minQueue.isNotEmpty()) {
            sum -= minQueue.poll()
        }

        while (maxQueue.isNotEmpty()) {
            sum -= maxQueue.poll()
        }

        return sum.toDouble() / (arr.size - (2 * k))
    }
}