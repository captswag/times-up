package refresh._2068

import kotlin.math.abs

class Solution {

    fun checkAlmostEquivalent(word1: String, word2: String): Boolean {
        val freq = IntArray(26)

        for (i in word1.indices) {
            freq[word1[i] - 'a']++
            freq[word2[i] - 'a']--
        }

        for (f in freq) {
            if (abs(f) > 3) {
                return false
            }
        }

        return true
    }
}