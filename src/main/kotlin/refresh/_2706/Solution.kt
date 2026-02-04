package refresh._2706

class Solution {

    fun buyChoco(prices: IntArray, money: Int): Int {
        var mn: Int
        var smn: Int
        if (prices[0] < prices[1]) {
            mn = prices[0]
            smn = prices[1]
        } else {
            mn = prices[1]
            smn = prices[0]
        }

        for (i in 2 until prices.size) {
            if (prices[i] < mn) {
                smn = mn
                mn = prices[i]
            } else if (prices[i] < smn) {
                smn = prices[i]
            }
        }

        val sum = mn + smn
        return if (money - sum < 0) {
            money
        } else {
            money - sum
        }
    }
}