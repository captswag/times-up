package leetcode._2016

class Solution {
    fun maximumDifference(nums: IntArray): Int {
        var minValue = nums[0]
        var maxDiff = 0

        for (index in 1 until nums.size) {
            minValue = Math.min(nums[index], minValue)
            maxDiff = Math.max(nums[index] - minValue, maxDiff)
        }

        return if (maxDiff == 0) {
            -1
        } else {
            maxDiff
        }
    }
}