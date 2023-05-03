package leetcode._2586

class Solution {

    fun vowelStrings(words: Array<String>, left: Int, right: Int): Int {
        var output = 0

        for (index in left..right) {
            val word = words[index]
            if (isVowel(word[0]) && isVowel(word[word.length - 1])) {
                output++
            }
        }

        return output
    }

    private fun isVowel(char: Char): Boolean = char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u'
}