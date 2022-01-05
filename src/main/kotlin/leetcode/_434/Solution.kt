package leetcode._434

class Solution {
    fun countSegments(s: String): Int {
        var startWord = false
        var count = 0
        for (c in s) {
            if (c == ' ') {
                if (startWord) {
                    startWord = false
                    count++
                }
            } else {
                startWord = true
            }
        }
        return if (startWord) {
            count + 1
        } else {
            count
        }
    }
}