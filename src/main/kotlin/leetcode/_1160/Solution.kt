package leetcode._1160

class Solution {
    fun countCharacters(words: Array<String>, chars: String): Int {
        val charsCountArray = IntArray(26)

        for (c in chars) {
            charsCountArray[c - 'a']++
        }

        var output = 0
        for (word in words) {
            if (isGood(charsCountArray, word)) {
                output += word.length
            }
        }
        return output
    }

    private fun isGood(charsCountArray: IntArray, word: String): Boolean {
        var good = true
        val wordCountArray = IntArray(26)

        for (c in word) {
            wordCountArray[c - 'a']++
        }

        for (index in 0..25) {
            if (wordCountArray[index] > charsCountArray[index]) {
                good = false
            }
        }
        return good
    }
}