package refresh._2016

import kotlin.math.max
import kotlin.math.min

class Solution {

    fun maximumDifference(nums: IntArray): Int {
        var mn = nums[0]
        var ans = -1

        for (i in 1 until nums.size) {
            if (nums[i] > mn) {
                ans = max(ans, nums[i] - mn)
            }
            mn = min(mn, nums[i])
        }

        return ans
    }
}