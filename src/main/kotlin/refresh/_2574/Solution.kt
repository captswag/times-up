package refresh._2574

import kotlin.math.abs

class Solution {

    fun leftRightDifference(nums: IntArray): IntArray {
        var ls = 0
        var rs = 0

        for (x in nums) {
            rs += x
        }

        var prv = 0
        for (i in nums.indices) {
            ls += prv
            rs -= nums[i]
            prv = nums[i]
            nums[i] = abs(ls - rs)
        }

        return nums
    }
}