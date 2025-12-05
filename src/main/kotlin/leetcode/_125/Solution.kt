package leetcode._125

class Solution {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1

        while (left < right) {
            if (s[left].isLetterOrDigit() && s[right].isLetterOrDigit()) {
                if (s[left++].lowercaseChar() != s[right--].lowercaseChar()) {
                    return false
                }
            } else if (s[left].isLetterOrDigit()) {
                right--
            } else {
                left++
            }
        }

        return true
    }
}