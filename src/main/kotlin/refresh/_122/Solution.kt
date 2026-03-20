package refresh._122

class Solution {

    fun maxProfit(prices: IntArray): Int {
        var mx = 0

        for (i in 1 until prices.size) {
            if (prices[i] > prices[i - 1]) {
                mx += prices[i] - prices[i - 1]
            }
        }

        return mx
    }
}