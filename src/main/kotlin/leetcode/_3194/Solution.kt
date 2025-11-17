package leetcode._3194

import java.util.*

class Solution {

    fun minimumAverage(nums: IntArray): Double {
        var left = 0
        var right = nums.size - 1
        var output = Double.MAX_VALUE

        Arrays.sort(nums)
        while (left < right) {
            output = Math.min(output, (nums[left++].toDouble() + nums[right--]) / 2)
        }

        return output
    }
}