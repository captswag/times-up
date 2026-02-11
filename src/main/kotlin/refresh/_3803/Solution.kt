package refresh._3803

class Solution {

    fun residuePrefixes(s: String): Int {
        val seen = BooleanArray(26)
        var distinct = 0
        var cnt = 0

        for (i in s.indices) {
            if (!seen[s[i] - 'a']) {
                distinct++
                seen[s[i] - 'a'] = true
            }

            if (distinct == (i + 1) % 3) {
                cnt++
            }
        }

        return cnt
    }
}