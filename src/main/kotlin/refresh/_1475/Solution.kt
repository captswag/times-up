package refresh._1475

class Solution {

    fun finalPrices(prices: IntArray): IntArray {
        val queue = ArrayDeque<Int>()
        var k = 0

        for (i in prices.indices) {
            if (queue.isEmpty()) {
                queue.addLast(prices[i])
            } else {
                while (queue.isNotEmpty() && prices[i] <= queue.first()) {
                    prices[k++] = queue.removeFirst() - prices[i]
                }
                queue.addLast(prices[i])
            }
        }

        while (queue.isNotEmpty()) {
            prices[k++] = queue.removeFirst()
        }

        return prices
    }
}