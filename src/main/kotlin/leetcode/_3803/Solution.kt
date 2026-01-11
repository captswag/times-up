package leetcode._3803

class Solution {

    fun residuePrefixes(s: String): Int {
        val frequency = IntArray(26)
        var distinct = 0
        var residuePrefixes = 0

        for (i in s.indices) {
            frequency[s[i] - 'a']++
            if (frequency[s[i] - 'a'] == 1) {
                distinct++
            }
            if (distinct == ((i + 1) % 3)) {
                residuePrefixes++
            }
        }

        return residuePrefixes
    }
}