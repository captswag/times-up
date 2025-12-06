package leetcode._500

class Solution {
    fun findWords(words: Array<String>): Array<String> {
        val charRow = intArrayOf(1, 0, 0, 1, 2, 1, 1, 1, 2, 1, 1, 1, 0, 0, 2, 2, 2, 2, 1, 2, 2, 0, 2, 0, 2, 0)
        val result = mutableListOf<String>()

        for (word in words) {
            var index = 0
            val row = charRow[word[index].lowercaseChar() - 'a']
            index++

            while (index < word.length && charRow[word[index].lowercaseChar() - 'a'] == row) {
                index++
            }

            if (index == word.length) {
                result.add(word)
            }
        }

        return result.toTypedArray()
    }
}