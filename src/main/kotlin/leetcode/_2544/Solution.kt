package leetcode._2544

class Solution {

    fun alternateDigitSum(n: Int): Int {
        var count = 0
        var number = n
        var output = 0

        while (number != 0) {
            count++
            number /= 10
        }

        var sign = if (count % 2 == 0) {
            -1
        } else {
            1
        }

        number = n
        while (number != 0) {
            output += ((number % 10) * sign)
            sign *= -1
            number /= 10
        }

        return output
    }
}