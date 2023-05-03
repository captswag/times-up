package leetcode._2520

class Solution {

    fun countDigits(num: Int): Int {
        var number = num
        var output = 0

        while (number != 0) {
            val digit = number % 10
            if (num % digit == 0) {
                output++
            }
            number /= 10
        }

        return output
    }
}