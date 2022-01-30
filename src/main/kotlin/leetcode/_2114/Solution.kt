package leetcode._2114

class Solution {
    fun mostWordsFound(sentences: Array<String>): Int {
        var maxWords = -1
        for (sentence in sentences) {
            val words = findWordsInSentence(sentence)
            if (words > maxWords) {
                maxWords = words
            }
        }
        return maxWords
    }

    private fun findWordsInSentence(word: String): Int {
        var count = 1
        for (c in word) {
            if (c == ' ') {
                count++
            }
        }
        return count
    }
}