package leetcode._724

class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var totalSum = 0

        for (num in nums) {
            totalSum += num
        }

        var output = -1
        var leftSum = 0
        for (index in nums.indices) {
            if (leftSum == (totalSum - leftSum - nums[index])) {
                output = index
                break
            }
            leftSum += nums[index]
        }

        return output
    }
}