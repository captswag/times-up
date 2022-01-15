package leetcode._917

class Solution {
    fun reverseOnlyLetters(s: String): String {
        val characters = s.toCharArray()
        var first = 0
        var last = characters.size - 1

        while (first < last) {
            if (characters[first].isLetter() && characters[last].isLetter()) {
                // Swap both and increment/decrement indices
                val temp = characters[last]
                characters[last] = characters[first]
                characters[first] = temp
                first++
                last--
            } else {
                if (!characters[first].isLetter()) {
                    first++
                }
                if (!characters[last].isLetter()) {
                    last--
                }
            }
        }

        return String(characters)
    }
}