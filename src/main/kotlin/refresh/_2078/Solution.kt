package refresh._2078

import kotlin.math.max

class Solution {

    fun maxDistance(colors: IntArray): Int {
        var mx = 0

        for (i in colors.indices) {
            if (colors[i] != colors[0]) {
                mx = max(mx, i)
            }

            if (colors[i] != colors[colors.size - 1]) {
                mx = max(mx, colors.size - i - 1)
            }
        }

        return mx
    }
}