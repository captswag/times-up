package refresh._3438

class Solution {

    fun findValidPair(s: String): String {
        val freq = IntArray(10)

        for (c in s) {
            freq[c - '0']++
        }

        for (i in 1 until s.length) {
            val prev = s[i - 1] - '0'
            val cur = s[i] - '0'
            if (prev != cur && prev == freq[prev] && cur == freq[cur]) {
                return "$prev$cur"
            }
        }

        return ""
    }
}