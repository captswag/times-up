package leetcode._2644

class Solution {

    fun maxDivScore(nums: IntArray, divisors: IntArray): Int {
        var maxDivScore = -1
        var maxCount = -1

        for (divisor in divisors) {
            var currCount = 0
            for (num in nums) {
                if (num % divisor == 0) {
                    currCount++
                }
            }

            if (currCount > maxCount) {
                maxCount = currCount
                maxDivScore = divisor
            } else if (currCount == maxCount) {
                maxDivScore = Math.min(maxDivScore, divisor)
            }
        }

        return maxDivScore
    }
}