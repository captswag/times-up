package leetcode._748

class Solution {
    fun shortestCompletingWord(licensePlate: String, words: Array<String>): String {
        val licensePlateCountArray = IntArray(26)

        for (c in licensePlate) {
            if (c.isLetter()) {
                licensePlateCountArray[c.toLowerCase() - 'a']++
            }
        }

        var minLength = Integer.MAX_VALUE
        var output = ""
        for (index in words.indices) {
            if (isCompletingWord(licensePlateCountArray, words[index]) && words[index].length < minLength) {
                minLength = words[index].length
                output = words[index]
            }
        }

        return output
    }

    private fun isCompletingWord(licensePlateCountArray: IntArray, word: String): Boolean {
        var completing = true
        val wordCountArray = IntArray(26)

        for (c in word) {
            wordCountArray[c - 'a']++
        }

        for (index in licensePlateCountArray.indices) {
            if (licensePlateCountArray[index] > wordCountArray[index]) {
                completing = false
                break
            }
        }

        return completing
    }
}