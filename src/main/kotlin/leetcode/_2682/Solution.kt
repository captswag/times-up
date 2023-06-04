package leetcode._2682

class Solution {

    fun circularGameLosers(n: Int, k: Int): IntArray {
        var multiplier = 1
        var ballPosition = 0
        val set = mutableSetOf<Int>()

        while (ballPosition !in set) {
            set.add(ballPosition)
            ballPosition = (ballPosition + (multiplier++ * k)) % n
        }

        val output = IntArray(n - set.size)
        var index = 0
        for (friend in 0 until n) {
            if (friend !in set) {
                output[index++] = friend + 1
            }
        }
        return output
    }
}