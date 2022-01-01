package leetcode._989

class Solution {
    fun addToArrayForm(num: IntArray, k: Int): List<Int> {
        val output = mutableListOf<Int>()
        var lastIndex = num.size - 1
        var x = k
        var carryForward = 0

        while (lastIndex >= 0 || x != 0) {
            val digit1 = if (lastIndex >= 0) {
                num[lastIndex]
            } else {
                0
            }

            val digit2 = if (x != 0) {
                val rem = x % 10
                x /= 10
                rem
            } else {
                0
            }

            var sum = digit1 + digit2 + carryForward

            if (sum > 9) {
                carryForward = 1
                sum %= 10
            } else {
                carryForward = 0
            }

            output.add(0, sum)
            lastIndex--
        }

        if (carryForward > 0) {
            output.add(0, carryForward)
        }

        return output
    }
}