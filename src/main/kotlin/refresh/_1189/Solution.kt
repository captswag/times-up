package refresh._1189

import kotlin.math.min

class Solution {

    fun maxNumberOfBalloons(text: String): Int {
        val freq = IntArray(26)

        for (c in text) {
            freq[c - 'a']++
        }

        val need = intArrayOf(1, 11, 13, 14)
        var mn = freq[0]

        for (idx in need) {
            mn = if (idx == 11 || idx == 14) {
                min(mn, freq[idx] / 2)
            } else {
                min(mn, freq[idx])
            }
        }

        return mn
    }
}