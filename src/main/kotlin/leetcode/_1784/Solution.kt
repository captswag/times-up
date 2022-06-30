package leetcode._1784

class Solution {
    fun checkOnesSegment(s: String): Boolean {
        var output = true
        var prev = '1'

        for (index in 1 until s.length) {
            if (prev == '0' && s[index] == '1') {
                output = false
            } else {
                prev = s[index]
            }
        }

        return output
    }
}