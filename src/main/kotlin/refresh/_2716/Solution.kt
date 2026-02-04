package refresh._2716

class Solution {

    fun minimizedStringLength(s: String): Int {
        val seen = BooleanArray(26)
        var cnt = 0

        for (c in s) {
            if (!seen[c - 'a']) {
                seen[c - 'a'] = true
                cnt++
            }
        }

        return cnt
    }
}