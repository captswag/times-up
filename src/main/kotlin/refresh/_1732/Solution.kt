package refresh._1732

class Solution {

    fun largestAltitude(gain: IntArray): Int {
        var highestAltitude = 0
        var sum = 0

        for (g in gain) {
            sum += g
            if (sum > highestAltitude) {
                highestAltitude = sum
            }
        }

        return highestAltitude
    }
}