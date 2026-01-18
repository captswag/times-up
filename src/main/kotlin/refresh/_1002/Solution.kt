package refresh._1002

import kotlin.math.min

class Solution {

    fun commonChars(words: Array<String>): List<String> {
        val frequency = IntArray(26)

        var i = 0
        for (c in words[i]) {
            frequency[c - 'a']++
        }
        i++

        while (i < words.size) {
            val currFrequency = IntArray(26)

            for (c in words[i]) {
                currFrequency[c - 'a']++
            }

            for (j in frequency.indices) {
                frequency[j] = min(frequency[j], currFrequency[j])
            }

            i++
        }

        val res = mutableListOf<String>()
        for (j in frequency.indices) {
            while (frequency[j] > 0) {
                res.add("${(j + 97).toChar()}")
                frequency[j]--
            }
        }

        return res
    }
}