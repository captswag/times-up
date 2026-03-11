package refresh._3074

import kotlin.math.min

class Solution {

    fun minimumBoxes(apple: IntArray, capacity: IntArray): Int {
        var tot = 0
        for (x in apple) {
            tot += x
        }

        val cnt = IntArray(51)
        for (x in capacity) {
            cnt[x]++
        }

        var i = cnt.size - 1
        var ans = 0

        while (tot > 0) {
            if (cnt[i] > 0) {
                tot -= min(tot, i)
                cnt[i]--
                ans++
            } else {
                i--
            }
        }

        return ans
    }
}