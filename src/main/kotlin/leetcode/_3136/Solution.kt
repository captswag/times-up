package leetcode._3136

class Solution {

    fun isValid(word: String): Boolean {
        var output = true
        var vowel = false
        var consonant = false
        val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

        if (word.length >= 3) {

            for (c in word) {
                if (c in 'a'..'z' || c in 'A'..'Z') {
                    if (c in vowels) {
                        vowel = true
                    } else {
                        consonant = true
                    }
                } else if (c !in '0'..'9') {
                    output = false
                }
            }

        } else {
            output = false
        }

        return output && vowel && consonant
    }
}