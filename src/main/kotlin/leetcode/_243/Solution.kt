package leetcode._243

class Solution {
    fun shortestDistance(wordsDict: Array<String>, word1: String, word2: String): Int {
        var word1Index = -1
        var word2Index = -1
        var diff = Integer.MAX_VALUE

        for (index in wordsDict.indices) {
            if (wordsDict[index] == word1) {
                word1Index = index
                if (word2Index > -1) {
                    val newDiff = word1Index - word2Index
                    if (newDiff < diff) {
                        diff = newDiff
                    }
                }
            } else if (wordsDict[index] == word2) {
                word2Index = index
                if (word1Index > -1) {
                    val newDiff = word2Index - word1Index
                    if (newDiff < diff) {
                        diff = newDiff
                    }
                }
            }
        }

        return diff
    }
}