package leetcode._1662

class Solution {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        val size1 = findWordArrayLength(word1)
        val size2 = findWordArrayLength(word2)
        var output = true

        if (size1 == size2) {
            var totalIndex = 0
            var word1Index = 0
            var individualWord1Index = 0
            var word2Index = 0
            var individualWord2Index = 0
            while (totalIndex < size1) {
                if (individualWord1Index >= word1[word1Index].length) {
                    word1Index++
                    individualWord1Index = 0
                }
                val char1 = word1[word1Index][individualWord1Index]
                individualWord1Index++
                if (individualWord2Index >= word2[word2Index].length) {
                    word2Index++
                    individualWord2Index = 0
                }
                val char2 = word2[word2Index][individualWord2Index]
                individualWord2Index++
                if (char1 != char2) {
                    output = false
                    break
                }
                totalIndex++
            }
        } else {
            output = false
        }

        return output
    }

    private fun findWordArrayLength(words: Array<String>): Int {
        var length = 0
        for (word in words) {
            length += word.length
        }
        return length
    }
}