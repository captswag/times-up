package refresh._3083

class Solution {

    fun isSubstringPresent(s: String): Boolean {
        val seen = BooleanArray(676)

        for (i in 1 until s.length) {
            seen[idx(s[i - 1], s[i])] = true
            if (seen[idx(s[i], s[i - 1])]) {
                return true
            }
        }

        return false
    }

    private fun idx(c1: Char, c2: Char): Int {
        return ((c1 - 'a') * 26) + (c2 - 'a')
    }
}