package leetcode._3813

class Solution {

    fun vowelConsonantScore(s: String): Int {
        var vowels = 0
        var consonants = 0

        for (c in s) {
            if (isVowel(c)) {
                vowels++
            } else if (c.isLetter()) {
                consonants++
            }
        }

        return if (consonants == 0) {
            0
        } else {
            vowels / consonants
        }
    }

    private fun isVowel(c: Char): Boolean {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
    }
}