package leetcode._2303

class Solution {
    fun calculateTax(brackets: Array<IntArray>, income: Int): Double {
        var output = 0.0
        var index = 0
        var incomeValue = income
        var prev = 0

        do {
            val upper = brackets[index][0] - prev
            val min = Math.min(incomeValue, upper)

            output += (min * brackets[index][1]).toDouble() / 100
            incomeValue -= upper

            prev = brackets[index][0]
            index++
        } while (incomeValue > 0)

        return output
    }
}