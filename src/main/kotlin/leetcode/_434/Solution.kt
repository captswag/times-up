package leetcode._434

class Solution {

    fun countSegments(s: String): Int {
        var i = 0
        var cnt = 0

        while (i < s.length) {
            if (s[i] == ' ') {
                i++
            } else {
                while (i < s.length && s[i] != ' ') {
                    i++
                }
                cnt++
            }
        }

        return cnt
    }
}