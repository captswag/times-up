package refresh._485

import kotlin.math.max

class Solution {

    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var mx = 0
        var cnt = 0

        for (x in nums) {
            if (x == 1) {
                cnt++
                mx = max(mx, cnt)
            } else {
                cnt = 0
            }
        }

        return mx
    }
}