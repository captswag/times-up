package leetcode._415

class Solution {
    fun addStrings(num1: String, num2: String): String {
        var lastIndex1 = num1.length - 1
        var lastIndex2 = num2.length - 1

        var output = ""
        var carryForward = 0
        while (lastIndex1 >= 0 || lastIndex2 >= 0) {
            val digit1 = findDigit(num1, lastIndex1)
            val digit2 = findDigit(num2, lastIndex2)

            var sum = digit1 + digit2 + carryForward
            if (sum > 9) {
                sum %= 10
                carryForward = 1
            } else {
                carryForward = 0
            }

            output = "$sum" + output

            lastIndex1--
            lastIndex2--
        }

        if (carryForward > 0) {
            output = "$carryForward" + output
        }

        return output
    }

    private fun findDigit(num: String, index: Int): Int = if (index >= 0) {
        Character.getNumericValue(num[index])
    } else {
        0
    }
}