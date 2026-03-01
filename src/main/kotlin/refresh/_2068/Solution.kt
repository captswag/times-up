package refresh._2068

import kotlin.math.abs

class Solution {

    fun checkAlmostEquivalent(word1: String, word2: String): Boolean {
        val freq = IntArray(26)

        for (c in word1) {
            freq[c - 'a']++
        }

        for (c in word2) {
            freq[c - 'a']--
        }

        for (f in freq) {
            if (abs(f) > 3) {
                return false
            }
        }

        return true
    }
}