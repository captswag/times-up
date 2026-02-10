package refresh._575

import kotlin.math.min

class Solution {

    fun distributeCandies(candyType: IntArray): Int {
        val seen = mutableSetOf<Int>()

        for (x in candyType) {
            seen.add(x)
        }

        return min(seen.size, candyType.size / 2)
    }
}