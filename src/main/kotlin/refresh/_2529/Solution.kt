package refresh._2529

import kotlin.math.max

class Solution {

    fun maximumCount(nums: IntArray): Int {
        var neg = 0
        var pos = 0

        for (num in nums) {
            if (num > 0) {
                pos++
            } else if (num < 0) {
                neg++
            }
        }

        return max(pos, neg)
    }
}