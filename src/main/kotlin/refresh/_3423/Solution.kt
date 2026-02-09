package refresh._3423

import kotlin.math.abs

class Solution {

    fun maxAdjacentDistance(nums: IntArray): Int {
        var mx = 0

        for (i in 1 until nums.size + 1) {
            val cur = abs(nums[i % nums.size] - nums[i - 1])
            if (cur > mx) {
                mx = cur
            }
        }

        return mx
    }
}