package refresh._3014

import kotlin.math.min

class Solution {

    fun minimumPushes(word: String): Int {
        var n = word.length
        var mul = 1
        var tot = 0

        while (n != 0) {
            val mn = min(8, n)
            tot += (mn * mul)
            mul++
            n -= mn
        }

        return tot
    }
}