package refresh._2490

class Solution {

    fun isCircularSentence(sentence: String): Boolean {
        for (i in sentence.indices) {
            if (sentence[i] == ' ') {
                if (sentence[i - 1] != sentence[i + 1]) {
                    return false
                }
            }
        }

        return sentence[0] == sentence[sentence.length - 1]
    }
}