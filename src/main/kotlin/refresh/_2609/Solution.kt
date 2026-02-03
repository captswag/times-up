package refresh._2609

import kotlin.math.min

class Solution {

    fun findTheLongestBalancedSubstring(s: String): Int {
        var zeros = 0
        var ones = 0
        var mx = 0

        for (c in s) {
            if (c == '0') {
                if (ones > 0) {
                    zeros = 1
                    ones = 0
                } else {
                    zeros++
                }
            } else {
                if (ones >= zeros) {
                    zeros = 0
                    ones = 0
                } else {
                    ones++
                }
            }

            val mn = min(zeros, ones) * 2
            if (mn > mx) {
                mx = mn
            }
        }

        return mx
    }
}