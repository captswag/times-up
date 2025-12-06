package leetcode._392

class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var si = 0
        var ti = 0

        while (si < s.length && ti < t.length) {
            if (s[si] == t[ti]) {
                si++
            }
            ti++
        }

        return si == s.length
    }
}