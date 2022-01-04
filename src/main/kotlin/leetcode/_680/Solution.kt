package leetcode._680

class Solution {
    fun validPalindrome(s: String): Boolean {
        var output = true
        if (!isPalindrome(s, 0, s.length - 1)) {
            // Check till it breaks.
            var start = 0
            var end = s.length - 1

            while (start < end) {
                if (s[start] != s[end]) {
                    val left = isPalindrome(s, start + 1, end)
                    val right = isPalindrome(s, start, end - 1)
                    output = left || right
                    break
                }
                start++
                end--
            }
        }

        return output
    }

    private fun isPalindrome(s: String, start: Int, end: Int): Boolean {
        var startIndex = start
        var endIndex = end
        var output = true

        while (startIndex < endIndex) {
            if (s[startIndex] != s[endIndex]) {
                output = false
                break
            }
            startIndex++
            endIndex--
        }

        return output
    }
}