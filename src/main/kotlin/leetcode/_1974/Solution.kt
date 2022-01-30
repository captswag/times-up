package leetcode._1974

class Solution {
    fun minTimeToType(word: String): Int {
        var currentPosition = 26 // Which is 'a'
        var output = 0

        for (c in word) {
            val position1 = getPosition1(c)
            val position2 = getPosition2(position1)
            val diff1 = Math.abs(currentPosition - position1)
            val diff2 = Math.abs(currentPosition - position2)
            output += if (diff1 < diff2) {
                diff1 + 1
            } else {
                diff2 + 1
            }
            currentPosition = getPositionInRange(position1, position2)
        }

        return output
    }

    private fun getPositionInRange(position1: Int, position2: Int): Int {
        val range = 12..37
        return if (position1 in range) {
            position1
        } else {
            position2
        }
    }

    private fun getPosition1(c: Char): Int = c.toInt() - 97

    private fun getPosition2(position1: Int): Int = position1 + 26
}