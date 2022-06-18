package leetcode._1332

class Solution {
    fun removePalindromeSub(s: String): Int {
        var startIndex = 0
        var endIndex = s.length - 1
        var palindrome = true

        while (startIndex < endIndex) {
            if (s[startIndex] == s[endIndex]) {
                startIndex++
                endIndex--
            } else {
                palindrome = false
                break
            }
        }

        return if (palindrome) {
            1
        } else {
            2
        }
    }
}