package refresh._2273

class Solution {

    fun removeAnagrams(words: Array<String>): List<String> {
        var i = 0
        var j = 0
        val res = mutableListOf<String>()

        while (j < words.size) {
            if (i == j) {
                res.add(words[i])
            }

            if (areAnagrams(words[i], words[j])) {
                j++
            } else {
                i = j
            }
        }

        return res
    }

    private fun areAnagrams(word1: String, word2: String): Boolean {
        val f1 = IntArray(26)
        for (c in word1) {
            f1[c - 'a']++
        }

        val f2 = IntArray(26)
        for (c in word2) {
            f2[c - 'a']++
        }

        for (i in f1.indices) {
            if (f1[i] != f2[i]) {
                return false
            }
        }

        return true
    }
}