package refresh._3168

import kotlin.math.max

class Solution {

    fun minimumChairs(s: String): Int {
        var cnt = 0
        var ans = 0

        for (c in s) {
            if (c == 'E') {
                cnt++
                ans = max(ans, cnt)
            } else {
                cnt--
            }
        }

        return ans
    }
}