package refresh._1165

import kotlin.math.abs

class Solution {

    fun calculateTime(keyboard: String, word: String): Int {
        val mp = IntArray(26)

        for (i in keyboard.indices) {
            mp[keyboard[i] - 'a'] = i
        }

        var prev = 0
        var cnt = 0

        for (c in word) {
            val cur = mp[c - 'a']
            cnt += abs(cur - prev)
            prev = cur
        }

        return cnt
    }
}