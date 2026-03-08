package leetcode._1456

import kotlin.math.max

class Solution {

    fun maxVowels(s: String, k: Int): Int {
        var cur = 0

        for (i in 0 until k) {
            if (isVowel(s[i])) {
                cur++
            }
        }

        var mx = cur
        for (i in 1 until s.length - k + 1) {
            if (isVowel(s[i - 1])) {
                cur--
            }
            if (isVowel(s[i + k - 1])) {
                cur++
            }
            mx = max(mx, cur)
        }

        return mx
    }

    private fun isVowel(c: Char): Boolean {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
    }
}