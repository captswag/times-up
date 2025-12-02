package refresh._346

class MovingAverage(size: Int) {
    val size = size
    var queue = ArrayDeque<Int>()
    var sum = 0

    fun next(`val`: Int): Double {
        if (queue.size == size) {
            sum -= queue.removeFirst()
        }
        queue.addLast(`val`)
        sum += `val`

        return sum.toDouble() / queue.size
    }
}