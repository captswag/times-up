package leetcode._3099

class Solution {

    fun sumOfTheDigitsOfHarshadNumber(x: Int): Int {
        var number = x
        var output = 0

        while (number != 0) {
            output += number % 10
            number /= 10
        }

        return if (x % output == 0) {
            output
        } else {
            -1
        }
    }
}