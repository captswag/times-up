package leetcode._500

class Solution {
    fun findWords(words: Array<String>): Array<String> {
        val output = mutableListOf<String>()
        val charRowArray = intArrayOf(2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3)

        for (word in words) {
            val belongsIn = charRowArray[word[0].toLowerCase() - 'a']
            var canBeTyped = true
            for (index in 1 until word.length) {
                val char = word[index].toLowerCase()
                if (charRowArray[char - 'a'] != belongsIn) {
                    canBeTyped = false
                    break
                }
            }
            if (canBeTyped) {
                output.add(word)
            }
        }

        return output.toTypedArray()
    }
}