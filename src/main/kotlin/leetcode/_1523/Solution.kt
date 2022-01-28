package leetcode._1523

class Solution {
    fun countOdds(low: Int, high: Int): Int {
        val diff = high - low
        val output = diff / 2

        return if (isOdd(low) || isOdd(high)) {
            output + 1
        } else {
            output
        }
    }

    private fun isOdd(number: Int): Boolean = number % 2 == 1
}