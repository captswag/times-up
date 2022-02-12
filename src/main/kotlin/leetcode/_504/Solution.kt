package leetcode._504

class Solution {
    fun convertToBase7(num: Int): String {
        val negative: Boolean
        var number = if (num < 0) {
            negative = true
            Math.abs(num)
        } else {
            negative = false
            num
        }

        val output = StringBuilder()
        while (number != 0) {
            output.insert(0, number % 7)
            number /= 7
        }

        return if (output.isEmpty()) {
            "0"
        } else if (negative) {
            output.insert(0, "-")
            output.toString()
        } else {
            output.toString()
        }
    }
}