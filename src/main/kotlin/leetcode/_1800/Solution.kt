package leetcode._1800

class Solution {

    fun maxAscendingSum(nums: IntArray): Int {
        var index = 0
        var currSum = nums[index++]
        var maxSum = currSum

        while (index < nums.size) {
            if (nums[index - 1] < nums[index]) {
                currSum += nums[index]
            } else {
                maxSum = Math.max(maxSum, currSum)
                currSum = nums[index]
            }
            index++
        }

        return Math.max(maxSum, currSum)
    }
}