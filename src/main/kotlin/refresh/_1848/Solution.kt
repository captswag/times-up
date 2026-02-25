package refresh._1848

import kotlin.math.abs

class Solution {

    fun getMinDistance(nums: IntArray, target: Int, start: Int): Int {
        var mn = Integer.MAX_VALUE

        for (i in nums.indices) {
            if (nums[i] == target) {
                val cur = abs(i - start)
                if (cur < mn) {
                    mn = cur
                }
            }
        }

        return mn
    }
}