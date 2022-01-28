package leetcode._1550

class Solution {
    fun threeConsecutiveOdds(arr: IntArray): Boolean {
        var count = 0
        var output = false

        for (integer in arr) {
            if (isOdd(integer)) {
                count++
            } else {
                count = 0
            }

            if (count == 3) {
                output = true
                break
            }
        }

        return output
    }

    private fun isOdd(integer: Int): Boolean = integer % 2 == 1
}