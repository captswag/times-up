package leetcode._1180

class Solution {
    fun countLetters(s: String): Int {
        var output = 0
        var count = 1
        var index = 0

        while (index + 1 <= s.length) {
            if (index + 1 == s.length || s[index] != s[index + 1]) {
                val n = (count * (count + 1)) / 2
                output += n
                count = 1
            } else {
                count++
            }
            index++
        }

        return output
    }
}