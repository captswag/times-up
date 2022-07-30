package leetcode._1005

import java.util.*

class Solution {
    fun largestSumAfterKNegations(nums: IntArray, k: Int): Int {
        Arrays.sort(nums)
        var kValue = k
        var index = 0

        while (kValue > 0 && index < nums.size && nums[index] < 0) {
            nums[index++] *= -1
            kValue--
        }

        var min = nums[0]
        var output = min
        for (i in 1 until nums.size) {
            if (nums[i] < min) {
                min = nums[i]
            }
            output += nums[i]
        }

        return if (kValue % 2 == 1) {
            output - (min * 2)
        } else {
            output
        }
    }
}