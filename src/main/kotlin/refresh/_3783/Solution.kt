package refresh._3783

import kotlin.math.abs

class Solution {

    fun mirrorDistance(n: Int): Int {
        var x = n
        var rev = 0

        while (x != 0) {
            rev = (rev * 10) + (x % 10)
            x /= 10
        }

        return abs(n - rev)
    }
}