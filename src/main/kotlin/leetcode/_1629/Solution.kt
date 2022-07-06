package leetcode._1629

class Solution {
    fun slowestKey(releaseTimes: IntArray, keysPressed: String): Char {
        var index = 0
        var currentSlowest = releaseTimes[index]
        var previous = releaseTimes[index]
        var output = keysPressed[index]

        while (index < releaseTimes.size) {
            val slowestDiff = releaseTimes[index] - previous
            if (slowestDiff > currentSlowest) {
                currentSlowest = slowestDiff
                output = keysPressed[index]
            } else if (slowestDiff == currentSlowest) {
                if (keysPressed[index] > output) {
                    output = keysPressed[index]
                }
            }
            previous = releaseTimes[index]
            index++
        }

        return output
    }
}