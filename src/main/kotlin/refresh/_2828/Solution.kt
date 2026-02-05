package refresh._2828

class Solution {

    fun isAcronym(words: List<String>, s: String): Boolean {
        var i = 0

        while (i < words.size && i < s.length) {
            if (words[i][0] != s[i]) {
                return false
            }
            i++
        }

        return i == words.size && i == s.length
    }
}