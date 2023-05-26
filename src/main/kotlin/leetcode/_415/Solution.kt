package leetcode._415

class Solution {
    fun addStrings(num1: String, num2: String): String {
        var lastIndex1 = num1.length - 1
        var lastIndex2 = num2.length - 1
        var carryOver = 0
        val sb = StringBuilder()

        while (lastIndex1 >= 0 && lastIndex2 >= 0) {
            val number1 = getDigit(num1, lastIndex1)
            val number2 = getDigit(num2, lastIndex2)
            var sum = number1 + number2 + carryOver

            carryOver = sum / 10
            sum %= 10
            sb.insert(0, sum)

            lastIndex1--
            lastIndex2--
        }

        if (carryOver != 0) {
            sb.append(0, carryOver)
        }

        return String(sb)
    }

    private fun getDigit(num: String, index: Int): Int {
        return if (index < 0) {
            0
        } else {
            Character.getNumericValue(num[index])
        }
    }
}