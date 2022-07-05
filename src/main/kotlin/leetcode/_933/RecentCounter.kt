package leetcode._933

import java.util.*

class RecentCounter() {
    private val queue = LinkedList<Int>()

    fun ping(t: Int): Int {
        queue.add(t)
        val lowerBound = -3000 + t

        while (queue.peek() < lowerBound) {
            queue.remove()
        }

        return queue.size
    }

}