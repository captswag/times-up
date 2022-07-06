package leetcode._1422

class Solution {
    fun maxScore(s: String): Int {
        var left = if (s[0] == '0') 1 else 0
        var right = 0
        for (index in 1 until s.length) {
            if (s[index] == '1') {
                right++
            }
        }
        var output = left + right

        for (index in 2 until s.length) {
            if (s[index - 1] == '0') {
                left++
            } else {
                right--
            }
            output = Math.max(output, left + right)
        }

        return output
    }
}