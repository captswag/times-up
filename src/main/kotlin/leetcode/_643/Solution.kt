package leetcode._643

class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var currentSum = 0

        for (index in 0 until k) {
            currentSum += nums[index]
        }
        var output = currentSum

        for (index in k until nums.size) {
            currentSum += nums[index] - nums[index - k]
            output = Math.max(currentSum, output)
        }

        return output.toDouble() / k
    }
}