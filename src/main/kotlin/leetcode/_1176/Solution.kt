package leetcode._1176

class Solution {
    fun dietPlanPerformance(calories: IntArray, k: Int, lower: Int, upper: Int): Int {
        var output: Int
        var currentSum = 0

        for (index in 0 until k) {
            currentSum += calories[index]
        }
        output = getPoints(currentSum, lower, upper)

        for (index in k until calories.size) {
            currentSum += calories[index] - calories[index - k]
            output += getPoints(currentSum, lower, upper)
        }

        return output
    }

    private fun getPoints(value: Int, lower: Int, upper: Int): Int {
        return if (value < lower) {
            -1
        } else if (value > upper) {
            1
        } else {
            0
        }
    }
}