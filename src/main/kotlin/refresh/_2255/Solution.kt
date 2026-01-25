package refresh._2255

class Solution {

    fun countPrefixes(words: Array<String>, s: String): Int {
        var count = 0

        for (word in words) {
            if (isPrefix(word, s)) {
                count++
            }
        }

        return count
    }

    private fun isPrefix(word: String, s: String): Boolean {
        var i = 0
        var j = 0

        while (i < word.length && j < s.length) {
            if (word[i] != s[j]) {
                return false
            }
            i++
            j++
        }

        return i == word.length
    }
}