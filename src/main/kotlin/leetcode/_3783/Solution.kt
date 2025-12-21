package leetcode._3783

class Solution {

    fun mirrorDistance(n: Int): Int {
        var number = n
        var reverse = 0

        while (number != 0) {
            reverse = (reverse * 10) + (number % 10)
            number /= 10
        }

        return Math.abs(n - reverse)
    }
}