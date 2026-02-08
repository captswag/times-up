package refresh._3379

import kotlin.math.abs

class Solution {

    fun constructTransformedArray(nums: IntArray): IntArray {
        val ans = IntArray(nums.size)

        for (i in nums.indices) {
            if (nums[i] < 0) {
                ans[i] = nums[(i - (abs(nums[i]) % nums.size) + nums.size) % nums.size]
            } else if (nums[i] > 0) {
                ans[i] = nums[(i + nums[i]) % nums.size]
            }
        }

        return ans
    }
}