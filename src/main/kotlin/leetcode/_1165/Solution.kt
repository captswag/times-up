package leetcode._1165

class Solution {
    fun calculateTime(keyboard: String, word: String): Int {
        val keyboardMap = mutableMapOf<Char, Int>()

        for (index in keyboard.indices) {
            keyboardMap[keyboard[index]] = index
        }

        var currentIndex = 0
        var output = 0
        for (c in word) {
            val cIndex = keyboardMap[c]
            if (cIndex != null) {
                output += Math.abs(cIndex - currentIndex)
                currentIndex = cIndex
            }
        }
        return output
    }
}