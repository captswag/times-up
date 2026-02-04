package refresh._2739

import kotlin.math.min

class Solution {

    fun distanceTraveled(mainTank: Int, additionalTank: Int): Int {
        var m = mainTank
        var a = additionalTank
        var tot = 0

        while (m != 0) {
            val use = min(m, 5)
            m -= use
            if (use == 5 && a > 0) {
                m++
                a--
            }
            tot += (use * 10)
        }

        return tot
    }
}