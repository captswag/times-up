package leetcode._415

class Solution {
    fun addStrings(num1: String, num2: String): String {
        val output = StringBuilder()

        var lastIndex1 = num1.length - 1
        var lastIndex2 = num2.length - 1
        var carryOver = 0

        while (lastIndex1 >= 0 || lastIndex2 >= 0) {
            val number1 = getDigit(num1, lastIndex1)
            val number2 = getDigit(num2, lastIndex2)
            val sum = number1 + number2 + carryOver

            output.append(sum % 10)
            carryOver = sum / 10

            lastIndex1--
            lastIndex2--
        }

        if (carryOver != 0) {
            output.append(carryOver)
        }

        return String(output.reverse())
    }

    private fun getDigit(num: String, index: Int): Int {
        return if (index < 0) {
            0
        } else {
            Character.getNumericValue(num[index])
        }
    }
}