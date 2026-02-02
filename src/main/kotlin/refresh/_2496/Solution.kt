package refresh._2496

import kotlin.math.max

class Solution {

    fun maximumValue(strs: Array<String>): Int {
        var mx = 0

        for (str in strs) {
            var value = 0
            for (c in str) {
                if (c.isDigit()) {
                    value = (value * 10) + (c - '0')
                } else {
                    mx = max(mx, str.length)
                    value = 0
                    break
                }
            }
            if (value != 0) {
                mx = max(mx, value)
            }
        }

        return mx
    }
}