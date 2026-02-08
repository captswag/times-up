package refresh._3270

import kotlin.math.min

class Solution {

    fun generateKey(num1: Int, num2: Int, num3: Int): Int {
        var x = num1
        var y = num2
        var z = num3
        var key = 0
        var p = 1

        for (i in 0 until 4) {
            val d1 = x % 10
            x /= 10
            val d2 = y % 10
            y /= 10
            val d3 = z % 10
            z /= 10
            val mn = min(min(d1, d2), d3)

            key += (mn * p)
            p *= 10
        }

        return key
    }
}