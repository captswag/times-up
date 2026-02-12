package refresh._243

class Solution {

    fun shortestDistance(wordsDict: Array<String>, word1: String, word2: String): Int {
        var idx1 = -1
        var idx2 = -1
        var mn = Integer.MAX_VALUE

        for (i in wordsDict.indices) {
            if (eq(wordsDict[i], word1)) {
                idx1 = i
                if (idx2 != -1 && idx1 - idx2 < mn) {
                    mn = idx1 - idx2
                }
            } else if (eq(wordsDict[i], word2)) {
                idx2 = i
                if (idx1 != -1 && idx2 - idx1 < mn) {
                    mn = idx2 - idx1
                }
            }
        }

        return mn
    }

    private fun eq(word1: String, word2: String): Boolean {
        var i = 0

        while (i < word1.length && i < word2.length && word1[i] == word2[i]) {
            i++
        }

        return i == word1.length && i == word2.length
    }
}