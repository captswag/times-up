package refresh._1935

class Solution {

    fun canBeTypedWords(text: String, brokenLetters: String): Int {
        val isBroken = BooleanArray(26)

        for (brokenLetter in brokenLetters) {
            isBroken[brokenLetter - 'a'] = true
        }

        var i = 0
        var count = 0
        while (i < text.length) {
            var canBeTyped = true
            while (i < text.length && text[i] != ' ') {
                if (isBroken[text[i] - 'a']) {
                    canBeTyped = false
                }
                i++
            }
            if (canBeTyped) {
                count++
            }
            i++
        }

        return count
    }
}