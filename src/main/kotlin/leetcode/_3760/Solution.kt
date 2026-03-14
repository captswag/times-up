package leetcode._3760

class Solution {

    fun maxDistinct(s: String): Int {
        val seen = BooleanArray(26)
        var cnt = 0

        for (c in s) {
            if (!seen[c - 'a']) {
                cnt++
                seen[c - 'a'] = true
            }
        }

        return cnt
    }
}