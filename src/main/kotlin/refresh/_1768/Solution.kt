package refresh._1768

class Solution {

    fun mergeAlternately(word1: String, word2: String): String {
        var i = 0
        var j = 0
        val res = CharArray(word1.length + word2.length)
        var resIndex = 0

        while (i < word1.length && j < word2.length) {
            res[resIndex++] = word1[i++]
            res[resIndex++] = word2[j++]
        }

        while (i < word1.length) {
            res[resIndex++] = word1[i++]
        }

        while (j < word2.length) {
            res[resIndex++] = word2[j++]
        }

        return String(res)
    }
}