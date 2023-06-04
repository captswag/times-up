package leetcode._2706

class Solution {

    fun buyChoco(prices: IntArray, money: Int): Int {
        var min = 101
        var secondMin = 101

        for (price in prices) {
            if (price < secondMin) {
                if (price < min) {
                    secondMin = min
                    min = price
                } else {
                    secondMin = price
                }
            }
        }

        val total = min + secondMin
        return if (total <= money) {
            money - total
        } else {
            money
        }
    }
}