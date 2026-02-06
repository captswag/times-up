package refresh._3110

import kotlin.math.abs

class Solution {

    fun scoreOfString(s: String): Int {
        var score = 0

        for (i in 1 until s.length) {
            score += (abs(s[i] - s[i - 1]))
        }

        return score
    }
}