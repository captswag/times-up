package leetcode._58

class Solution {
    fun lengthOfLastWord(s: String): Int {
        var length = 0
        var blank = false

        for (char in s) {
            if (char == ' ') {
                blank = true
            } else {
                if (blank) {
                    length = 1
                    blank = false
                } else {
                    length++
                }
            }
        }
        return length
    }
}