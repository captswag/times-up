package leetcode._3726

class Solution {

    fun removeZeros(n: Long): Long {
        var number = n
        var placeValue: Long = 1
        var output: Long = 0

        while (number > 0) {
            val mod = number % 10

            if (mod > 0) {
                output += (mod * placeValue)
                placeValue *= 10
            }

            number /= 10
        }

        return output
    }
}