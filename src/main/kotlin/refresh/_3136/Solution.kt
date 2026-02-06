package refresh._3136

class Solution {

    fun isValid(word: String): Boolean {
        var hasVowel = false
        var hasConsonant = false

        for (c in word) {
            if (!c.isLetterOrDigit()) {
                return false
            }
            if (c.isLetter()) {
                if (isVowel(c)) {
                    hasVowel = true
                } else {
                    hasConsonant = true
                }
            }
        }

        return word.length > 2 && hasVowel && hasConsonant
    }

    private fun isVowel(c: Char): Boolean {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
    }
}