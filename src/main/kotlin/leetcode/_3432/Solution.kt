package leetcode._3432

class Solution {

    fun countPartitions(nums: IntArray): Int {
        var leftSum = 0
        var rightSum = 0

        for (num in nums) {
            rightSum += num
        }

        var output = 0

        for (index in 0 until nums.size - 1) {
            leftSum += nums[index]
            rightSum -= nums[index]
            if ((leftSum - rightSum) % 2 == 0) {
                output++
            }
        }

        return output
    }
}