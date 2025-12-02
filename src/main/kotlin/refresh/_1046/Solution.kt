package refresh._1046

import java.util.*

class Solution {

    fun lastStoneWeight(stones: IntArray): Int {
        val priorityQueue = PriorityQueue<Int>(compareByDescending { it })

        for (stone in stones) {
            priorityQueue.add(stone)
        }

        while (priorityQueue.size > 1) {
            val diff = priorityQueue.poll() - priorityQueue.poll()

            if (diff != 0) {
                priorityQueue.add(diff)
            }
        }

        return if (priorityQueue.size == 1) {
            priorityQueue.poll()
        } else {
            0
        }
    }
}