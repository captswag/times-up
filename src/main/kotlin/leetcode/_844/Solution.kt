package leetcode._844

class Solution {
    fun backspaceCompare(s: String, t: String): Boolean {
        var output = true

        val sArray = getCharArray(s)
        val tArray = getCharArray(t)

        // Compare both the CharArray's
        var sIndex = 0
        var tIndex = 0

        while (sIndex < sArray.size || tIndex < tArray.size) {
            if (sIndex == sArray.size && tIndex == tArray.size) {
                break
            } else if (sIndex == sArray.size) {
                if (tIndex != tArray.size && tArray[tIndex] != ' ') {
                    output = false
                    break
                } else {
                    break
                }
            } else if (tIndex == tArray.size) {
                if (sIndex != sArray.size && sArray[sIndex] != ' ') {
                    output = false
                    break
                } else {
                    break
                }
            } else if (sArray[sIndex] != tArray[tIndex]) {
                output = false
                break
            }
            sIndex++
            tIndex++
        }

        return output
    }

    private fun getCharArray(word: String): CharArray {
        val charArray = CharArray(word.length) { ' ' }

        var wordIndex = 0
        var charArrayIndex = 0

        while (wordIndex < word.length) {
            if (word[wordIndex] == '#') {
                if (charArrayIndex > 0) {
                    charArray[--charArrayIndex] = ' '
                }
            } else {
                charArray[charArrayIndex] = word[wordIndex]
                charArrayIndex++
            }
            wordIndex++
        }

        return charArray
    }
}