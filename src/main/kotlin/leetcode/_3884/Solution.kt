package leetcode._3884

class Solution {

    fun firstMatchingIndex(s: String): Int {
        val lim = (s.length + 2 - 1) / 2

        for (i in 0 until lim) {
            if (s[i] == s[s.length - i - 1]) {
                return i
            }
        }

        return -1
    }
}