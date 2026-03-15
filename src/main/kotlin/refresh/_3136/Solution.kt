package refresh._3136

class Solution {

    fun isValid(word: String): Boolean {
        var hasVow = false
        var hasCon = false

        for (c in word) {
            if (c == '@' || c == '#' || c == '$') {
                return false
            } else if (c.isLetter()) {
                if (isVowel(c)) {
                    hasVow = true
                } else {
                    hasCon = true
                }
            }
        }

        return word.length >= 3 && hasVow && hasCon
    }

    private fun isVowel(c: Char): Boolean {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
    }
}