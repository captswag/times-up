package refresh._121

class Solution {

    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0

        for (index in prices.size - 2 downTo 0) {
            val profit = prices[index + 1] - prices[index]
            if (profit > maxProfit) {
                maxProfit = profit
            }
            if (prices[index + 1] > prices[index]) {
                prices[index] = prices[index + 1]
            }
        }

        return maxProfit
    }
}