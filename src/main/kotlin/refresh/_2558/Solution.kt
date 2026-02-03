package refresh._2558

import java.util.*
import kotlin.math.sqrt

class Solution {

    fun pickGifts(gifts: IntArray, k: Int): Long {
        val maxHeap = PriorityQueue<Int> { a, b -> b - a }

        for (gift in gifts) {
            maxHeap.add(gift)
        }

        for (i in 0 until k) {
            val x = sqrt(maxHeap.poll().toDouble()).toInt()
            maxHeap.add(x)
        }

        var sum = 0L
        while (maxHeap.isNotEmpty()) {
            sum += maxHeap.poll()
        }

        return sum
    }
}