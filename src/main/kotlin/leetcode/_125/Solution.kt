package leetcode._125

class Solution {
    fun isPalindrome(s: String): Boolean {
        val sb = StringBuilder()
        for (c in s) {
            if (c.isUpperCase()) {
                sb.append(c.toLowerCase())
            } else if (c.isLetterOrDigit()) {
                sb.append(c)
            }
        }

        return checkIfPalindrome(sb.toString())
    }

    private fun checkIfPalindrome(s: String): Boolean {
        var startIndex = 0
        var endIndex = s.length - 1
        var palindrome = true

        while (startIndex < endIndex) {
            if (s[startIndex] != s[endIndex]) {
                palindrome = false
                break
            }
            startIndex++
            endIndex--
        }
        return palindrome
    }
}