package refresh._1629

class Solution {

    fun slowestKey(releaseTimes: IntArray, keysPressed: String): Char {
        var index = 0
        var slowest = releaseTimes[index]
        var slowestKey = keysPressed[index]
        index++

        while (index < releaseTimes.size) {
            val slowestCurr = releaseTimes[index] - releaseTimes[index - 1]
            if (slowestCurr == slowest && keysPressed[index] > slowestKey) {
                slowestKey = keysPressed[index]
            } else if (slowestCurr > slowest) {
                slowest = slowestCurr
                slowestKey = keysPressed[index]
            }
            index++
        }

        return slowestKey
    }
}