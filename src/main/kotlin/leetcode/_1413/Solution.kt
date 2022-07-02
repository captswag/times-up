package leetcode._1413

class Solution {
    fun minStartValue(nums: IntArray): Int {
        var output = 1
        var index = 0
        var sum = nums[index]
        var minCumulativeSum = sum
        index++

        while (index < nums.size) {
            sum += nums[index]
            minCumulativeSum = Math.min(sum, minCumulativeSum)
            index++
        }

        if (minCumulativeSum < 0) {
            output = 1 - minCumulativeSum
        }

        return output
    }
}