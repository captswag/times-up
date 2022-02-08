package leetcode._1832

class Solution {
    fun checkIfPangram(sentence: String): Boolean {
        var output = true
        val charArray = IntArray(26)

        for (c in sentence) {
            charArray[c - 'a']++
        }

        for (count in charArray) {
            if (count == 0) {
                output = false
            }
        }

        return output
    }
}