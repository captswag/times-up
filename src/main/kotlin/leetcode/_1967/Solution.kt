package leetcode._1967

class Solution {

    fun numOfStrings(patterns: Array<String>, word: String): Int {
        var count = 0

        for (pattern in patterns) {
            if (isSubstring(pattern, word)) {
                count++
            }
        }

        return count
    }

    private fun isSubstring(pattern: String, word: String): Boolean {
        var i = 0
        var j = 0
        while (j < word.length) {
            val k = j
            while (i < pattern.length && j < word.length && pattern[i] == word[j]) {
                i++
                j++
            }
            if (i == pattern.length) {
                return true
            } else {
                i = 0
                j = k + 1
            }
        }
        return false
    }
}