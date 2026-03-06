package refresh._125

class Solution {

    fun isPalindrome(s: String): Boolean {
        var l = 0
        var r = s.length - 1

        while (l < r) {
            while (l < r && !s[l].isLetterOrDigit()) {
                l++
            }

            while (l < r && !s[r].isLetterOrDigit()) {
                r--
            }

            if (s[l++].lowercaseChar() != s[r--].lowercaseChar()) {
                return false
            }
        }

        return true
    }
}