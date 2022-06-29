package leetcode._1732

class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var altitude = 0
        var output = altitude

        for (current in gain) {
            altitude += current
            output = Math.max(altitude, output)
        }

        return output
    }
}