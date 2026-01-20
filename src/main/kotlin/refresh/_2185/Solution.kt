package refresh._2185

class Solution {

    fun prefixCount(words: Array<String>, pref: String): Int {
        var count = 0
        for (word in words) {
            if (isPrefix(word, pref)) {
                count++
            }
        }
        return count
    }

    private fun isPrefix(word: String, pref: String): Boolean {
        var i = 0
        while (i < word.length && i < pref.length) {
            if (word[i] != pref[i]) {
                return false
            }
            i++
        }
        return i == pref.length
    }
}