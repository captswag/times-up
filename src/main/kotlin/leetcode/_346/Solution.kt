package leetcode._346

import java.util.*

class MovingAverage(size: Int) {
    private val length = size
    private val queue = LinkedList<Int>()
    private var sum = 0

    fun next(`val`: Int): Double {
        if (queue.size == length) {
            sum += `val` - queue.remove()
            queue.add(`val`)
        } else {
            sum += `val`
            queue.add(`val`)
        }
        return sum.toDouble() / queue.size
    }

}