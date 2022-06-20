package leetcode._1475

import java.util.*

class Solution {
    fun finalPrices(prices: IntArray): IntArray {
        val stack = Stack<Int>()
        val output = IntArray(prices.size)

        for (index in prices.indices) {
            while (stack.isNotEmpty() && prices[stack.peek()] >= prices[index]) {
                val diff = prices[stack.peek()] - prices[index]
                output[stack.pop()] = diff
            }
            stack.push(index)
        }
        while (stack.isNotEmpty()) {
            output[stack.peek()] = prices[stack.pop()]
        }

        return output
    }
}