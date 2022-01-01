package leetcode._2108

class Solution {
    fun firstPalindrome(words: Array<String>): String {
        var output = ""

        for (word in words) {
            if (isPalindrome(word)) {
                output = word
                break
            }
        }

        return output
    }

    private fun isPalindrome(s: String): Boolean {
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