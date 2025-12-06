package leetcode._415

class Solution {
    fun addStrings(num1: String, num2: String): String {
        val sum = CharArray(Math.max(num1.length, num2.length) + 1)
        var index1 = num1.length - 1
        var index2 = num2.length - 1
        var indexSum = sum.size - 1
        var carryOver = 0

        while (index1 >= 0 || index2 >= 0) {
            val currSum = getDigit(num1, index1) + getDigit(num2, index2) + carryOver
            carryOver = currSum / 10
            sum[indexSum] = ((currSum % 10) + 48).toChar()
            index1--
            index2--
            indexSum--
        }

        return if (carryOver == 1) {
            sum[indexSum] = (carryOver + 48).toChar()
            String(sum)
        } else {
            String(sum, 1, sum.size - 1)
        }
    }

    private fun getDigit(num: String, index: Int): Int {
        return if (index < 0) {
            0
        } else {
            num[index] - '0'
        }
    }
}