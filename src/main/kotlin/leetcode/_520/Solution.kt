package leetcode._520

class Solution {
    fun detectCapitalUse(word: String): Boolean {
        if (word.length == 1) {
            return true
        }

        var wi = 0
        val capital = if (word[wi++].isLowerCase()) {
            false
        } else {
            !word[wi++].isLowerCase()
        }

        while (wi < word.length) {
            if (capital) {
                if (word[wi++].isLowerCase()) {
                    return false
                }
            } else {
                if (word[wi++].isUpperCase()) {
                    return false
                }
            }
        }

        return true
    }
}