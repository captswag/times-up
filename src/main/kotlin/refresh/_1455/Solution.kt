package refresh._1455

class Solution {

    fun isPrefixOfWord(sentence: String, searchWord: String): Int {
        var wordIndex = 1
        var i = 0

        while (i < sentence.length) {
            var j = 0
            while (i < sentence.length && sentence[i] != ' ' && j < searchWord.length && sentence[i] == searchWord[j]) {
                i++
                j++
                if (j == searchWord.length) {
                    return wordIndex
                }
            }

            while (i < sentence.length && sentence[i] != ' ') {
                i++
            }

            wordIndex++
            i++
        }

        return -1
    }
}