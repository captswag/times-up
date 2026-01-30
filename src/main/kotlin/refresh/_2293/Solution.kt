package refresh._2293

import kotlin.math.max
import kotlin.math.min

class Solution {

    fun minMaxGame(nums: IntArray): Int {
        var size = nums.size

        while (size > 1) {
            var i = 0
            for (j in 0 until size step 2) {
                nums[i] = if (i and 1 == 0) {
                    min(nums[j], nums[j + 1])
                } else {
                    max(nums[j], nums[j + 1])
                }
                i++
            }
            size /= 2
        }

        return nums[0]
    }
}