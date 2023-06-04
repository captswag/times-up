package leetcode._2558

import java.util.*

class Solution {

    fun pickGifts(gifts: IntArray, k: Int): Long {
        val queue = PriorityQueue<Int> { a, b -> b - a }

        for (gift in gifts) {
            queue.add(gift)
        }

        for (index in 0 until k) {
            val max = queue.remove()
            queue.add(Math.sqrt(max.toDouble()).toInt())
        }

        var output = 0L
        while (queue.isNotEmpty()) {
            output += queue.remove()
        }
        return output
    }
}