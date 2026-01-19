package refresh._2068

import kotlin.math.abs

class Solution {

    fun checkAlmostEquivalent(word1: String, word2: String): Boolean {
        val frequencyWord1 = IntArray(26)

        for (c in word1) {
            frequencyWord1[c - 'a']++
        }

        val frequencyWord2 = IntArray(26)

        for (c in word2) {
            frequencyWord2[c - 'a']++
        }

        for (i in frequencyWord1.indices) {
            if (abs(frequencyWord1[i] - frequencyWord2[i]) > 3) {
                return false
            }
        }

        return true
    }
}