package leetcode._58

class Solution {
    fun lengthOfLastWord(s: String): Int {
        var length = 0

        for (index in s.length - 1 downTo 0) {
            if (s[index] != ' ') {
                length++
            } else if (length > 0) {
                break
            }
        }

        return length
    }
}