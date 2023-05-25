package leetcode._1165

class Solution {
    fun calculateTime(keyboard: String, word: String): Int {
        val keyboardArray = IntArray(26)

        for (index in keyboard.indices) {
            keyboardArray[keyboard[index] - 'a'] = index
        }

        var startPosition = 0
        var output = 0
        for (c in word) {
            val nextPosition = keyboardArray[c - 'a']
            output += Math.abs(nextPosition - startPosition)
            startPosition = nextPosition
        }
        return output
    }
}