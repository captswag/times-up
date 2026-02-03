package refresh._2574

import kotlin.math.abs

class Solution {

    fun leftRightDifference(nums: IntArray): IntArray {
        val leftSum = IntArray(nums.size)
        val rightSum = IntArray(nums.size)

        for (i in 1 until leftSum.size) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1]
        }

        for (i in rightSum.size - 2 downTo 0) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1]
        }

        for (i in nums.indices) {
            nums[i] = abs(leftSum[i] - rightSum[i])
        }

        return nums
    }
}