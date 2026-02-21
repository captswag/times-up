package refresh._1176

class Solution {

    fun dietPlanPerformance(calories: IntArray, k: Int, lower: Int, upper: Int): Int {
        var sum = 0

        for (i in 0 until k) {
            sum += calories[i]
        }

        var ans = 0
        ans += score(sum, lower, upper)

        for (i in 1 until calories.size - k + 1) {
            sum -= calories[i - 1]
            sum += calories[i + k - 1]
            ans += score(sum, lower, upper)
        }

        return ans
    }

    private fun score(sum: Int, lower: Int, upper: Int): Int {
        return if (sum < lower) {
            -1
        } else if (sum > upper) {
            1
        } else {
            0
        }
    }
}