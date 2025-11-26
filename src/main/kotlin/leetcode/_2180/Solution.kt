package leetcode._2180

class Solution {

    fun countEven(num: Int): Int {
        var sum = 0
        var number = num

        while (number != 0) {
            sum += number % 10
            number /= 10
        }

        return if (sum and 1 == 1) {
            num / 2
        } else {
            (num - 1) / 2
        }
    }
}