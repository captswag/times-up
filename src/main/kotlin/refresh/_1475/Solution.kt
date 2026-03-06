package refresh._1475

import java.util.*

class Solution {

    fun finalPrices(prices: IntArray): IntArray {
        val stk = Stack<Int>()

        for (i in prices.indices) {
            while (stk.isNotEmpty() && prices[stk.peek()] >= prices[i]) {
                prices[stk.pop()] -= prices[i]
            }
            stk.push(i)
        }

        return prices
    }
}