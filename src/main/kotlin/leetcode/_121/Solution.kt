package leetcode._121

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var min = prices[0]
        var output = 0

        for (index in 1 until prices.size) {
            min = Math.min(min, prices[index])
            output = Math.max(prices[index] - min, output)
        }

        return output
    }
}