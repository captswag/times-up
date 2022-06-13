package leetcode._1822

class Solution {
    fun arraySign(nums: IntArray): Int {
        var zero = false
        var negativeCount = 0

        for (num in nums) {
            if (num == 0) {
                zero = true
                break
            } else if (num < 0) {
                negativeCount++
            }
        }

        return if (zero) {
            0
        } else {
            if (isOdd(negativeCount)) {
                -1
            } else {
                1
            }
        }
    }

    private fun isOdd(num: Int): Boolean = num % 2 != 0
}