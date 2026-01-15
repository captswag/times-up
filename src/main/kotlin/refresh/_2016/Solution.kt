package refresh._2016

import kotlin.math.max

class Solution {

    fun maximumDifference(nums: IntArray): Int {
        var max = nums[nums.size - 1]
        var maxDiff = -1

        for (i in nums.size - 2 downTo 0) {
            if (max > nums[i]) {
                maxDiff = max(maxDiff, max - nums[i])
            } else {
                max = nums[i]
            }
        }

        return maxDiff
    }
}