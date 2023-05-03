package leetcode._2574

class Solution {

    fun leftRigthDifference(nums: IntArray): IntArray {
        var leftSum = 0
        var rightSum = 0
        val output = IntArray(nums.size)

        for (num in nums) {
            rightSum += num
        }

        for (index in nums.indices) {
            if (index != 0) {
                leftSum += nums[index - 1]
            }
            rightSum -= nums[index]

            output[index] = Math.abs(leftSum - rightSum)
        }

        return output
    }
}