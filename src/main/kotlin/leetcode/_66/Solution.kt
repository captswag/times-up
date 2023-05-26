package leetcode._66

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var all9 = true
        for (digit in digits) {
            if (digit != 9) {
                all9 = false
            }
        }

        val output = if (all9) {
            IntArray(digits.size + 1)
        } else {
            IntArray(digits.size)
        }

        var number = 1
        for (index in digits.size - 1 downTo 0) {
            val sum = digits[index] + number
            output[index] = sum % 10
            number = sum / 10
        }

        if (all9) {
            output[0] = number
        }

        return output
    }
}