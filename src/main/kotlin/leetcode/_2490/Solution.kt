package leetcode._2490

class Solution {

    fun isCircularSentence(sentence: String): Boolean {
        var output = true

        for (index in sentence.indices) {
            if (sentence[index] == ' ' && checkIfNotEqual(sentence, index - 1, index + 1)) {
                output = false
                break
            }
        }

        if (checkIfNotEqual(sentence, 0, sentence.length - 1)) {
            output = false
        }

        return output
    }

    private fun checkIfNotEqual(sentence: String, index1: Int, index2: Int): Boolean {
        return sentence[index1] != sentence[index2]
    }
}