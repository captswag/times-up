package refresh._2427

import kotlin.math.min

class Solution {

    fun commonFactors(a: Int, b: Int): Int {
        var cnt = 1

        for (i in 2..min(a, b)) {
            if (a % i == 0 && b % i == 0) {
                cnt++
            }
        }

        return cnt
    }
}