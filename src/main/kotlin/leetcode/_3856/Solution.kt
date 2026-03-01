package leetcode._3856

class Solution {

    fun trimTrailingVowels(s: String): String {
        var i = s.length - 1
        while (i >= 0 && (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u')) {
            i--
        }

        return s.substring(0, i + 1)
    }
}