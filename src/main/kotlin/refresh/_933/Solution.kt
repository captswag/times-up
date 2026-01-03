package refresh._933

class Solution {

    val queue = ArrayDeque<Int>()

    fun ping(t: Int): Int {
        queue.addLast(t)
        val lowerBound = t - 3000

        while (lowerBound > queue.first()) {
            queue.removeFirst()
        }

        return queue.size
    }
}