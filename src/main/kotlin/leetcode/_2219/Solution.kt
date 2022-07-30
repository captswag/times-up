package leetcode._2219

class Solution {
    fun maximumSumScore(nums: IntArray): Long {
        var leftSum = 0L
        var rightSum = 0L

        for (num in nums) {
            rightSum += num
        }

        var output = Long.MIN_VALUE
        for (num in nums) {
            leftSum += num
            val max = Math.max(leftSum, rightSum)
            if (max > output) {
                output = max
            }
            rightSum -= num
        }
        return output
    }
}