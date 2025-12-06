package leetcode._434

class Solution {
    fun countSegments(s: String): Int {
        var segments = 0
        var index = 0

        while (index < s.length) {
            if (s[index] == ' ') {
                index++
            } else {
                segments++
                index++
                while (index < s.length && s[index] != ' ') {
                    index++
                }
            }
        }

        return segments
    }
}