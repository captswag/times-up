package leetcode._1935

class Solution {
    fun canBeTypedWords(text: String, brokenLetters: String): Int {
        val set = mutableSetOf<Char>()

        for (c in brokenLetters) {
            set.add(c)
        }

        var output = 0
        var canBeTyped = true
        for (index in 0..text.length) {
            if (index == text.length || text[index] == ' ') {
                // Completion of a word
                if (canBeTyped) {
                    output++
                } else {
                    canBeTyped = true
                }
            } else {
                if (canBeTyped) {
                    if (set.contains(text[index])) {
                        canBeTyped = false
                    }
                }
            }
        }
        return output
    }
}