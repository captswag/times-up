package leetcode._3110

class Solution {

    fun scoreOfString(s: String): Int {
        var output = 0

        for (index in 1 until s.length) {
            output += (Math.abs(s[index] - s[index - 1]))
        }

        return output
    }
}