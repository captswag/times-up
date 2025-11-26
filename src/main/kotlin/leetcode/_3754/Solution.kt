package leetcode._3754

class Solution {

    fun sumAndMultiply(n: Int): Long {
        var number = n
        var nonZeroDigits = 0
        var placeValue = 1
        var sum = 0

        while (number != 0) {
            val mod = number % 10
            if (mod != 0) {
                nonZeroDigits += (mod * placeValue)
                placeValue *= 10
                sum += mod
            }
            number /= 10
        }

        return nonZeroDigits.toLong() * sum
    }
}