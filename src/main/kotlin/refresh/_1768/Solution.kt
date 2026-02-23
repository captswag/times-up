package refresh._1768

class Solution {

    fun mergeAlternately(word1: String, word2: String): String {
        var i = 0
        val res = CharArray(word1.length + word2.length)
        var k = 0

        while (i < word1.length && i < word2.length) {
            res[k++] = word1[i]
            res[k++] = word2[i]
            i++
        }

        while (i < word1.length) {
            res[k++] = word1[i++]
        }

        while (i < word2.length) {
            res[k++] = word2[i++]
        }

        return String(res)
    }
}