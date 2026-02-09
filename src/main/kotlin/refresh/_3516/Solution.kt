package refresh._3516

import kotlin.math.abs

class Solution {

    fun findClosest(x: Int, y: Int, z: Int): Int {
        val d1 = abs(z - x)
        val d2 = abs(z - y)

        return if (d1 == d2) {
            0
        } else if (d1 < d2) {
            1
        } else {
            2
        }
    }
}