package leetcode._1768

class Solution {
    fun mergeAlternatively(word1: String, word2: String): String {
        var index1 = 0
        var index2 = 0
        var firstIndex = true
        val output = StringBuilder()

        while (index1 < word1.length && index2 < word2.length) {
            if (firstIndex) {
                output.append(word1[index1])
                index1++
                firstIndex = false
            } else {
                output.append(word2[index2])
                index2++
                firstIndex = true
            }
        }

        while (index1 < word1.length) {
            output.append(word1[index1])
            index1++
        }

        while (index2 < word2.length) {
            output.append(word2[index2])
            index2++
        }

        return output.toString()
    }
}