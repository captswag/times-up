package refresh._2287

import kotlin.math.min

class Solution {

    fun rearrangeCharacters(s: String, target: String): Int {
        val frequencyS = IntArray(26)
        for (c in s) {
            frequencyS[c - 'a']++
        }

        val frequencyTarget = IntArray(26)
        for (c in target) {
            frequencyTarget[c - 'a']++
        }

        var count = -1
        for (i in frequencyTarget.indices) {
            if (frequencyTarget[i] > 0) {
                val currCount = frequencyS[i] / frequencyTarget[i]
                count = if (count == -1) {
                    currCount
                } else {
                    min(count, currCount)
                }
            }
        }

        return count
    }
}