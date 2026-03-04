package refresh._2441

import kotlin.math.abs

class Solution {

    fun findMaxK(nums: IntArray): Int {
        var res = -1
        val seen = BooleanArray(2001)

        for (x in nums) {
            if (seen[-x + 1000] && abs(x) > res) {
                res = abs(x)
            }
            seen[x + 1000] = true
        }

        return res
    }
}