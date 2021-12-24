package leetcode._66

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var lastIndex = digits.size - 1 // Given that the digits array is not empty
        var firstTime = true
        var carryForward = 0

        while (lastIndex >= 0) {
            val digit = digits[lastIndex]

            val sum: Int
            if (firstTime) {
                sum = digit + 1
                firstTime = false
            } else {
                sum = digit + carryForward
            }

            val value: Int
            if (sum == 10) {
                value = 0
                carryForward = 1
            } else {
                value = sum
                carryForward = 0
            }

            digits[lastIndex] = value
            lastIndex--
        }

        return if (carryForward == 1) {
            val updatedOutput = IntArray(digits.size + 1)
            updatedOutput[0] = 1

            for (index in digits.indices) {
                updatedOutput[index + 1] = digits[index]
            }
            updatedOutput
        } else {
            digits
        }
    }
}