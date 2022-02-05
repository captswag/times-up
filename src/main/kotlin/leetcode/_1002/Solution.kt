package leetcode._1002

class Solution {
    fun commonChars(words: Array<String>): List<String> {
        val wordCharMap = IntArray(26)

        for (c in words[0]) {
            wordCharMap[c - 'a']++
        }

        for (index in 1 until words.size) {
            // Construct a map for every word
            val currentWordCharMap = IntArray(26)
            for (c in words[index]) {
                currentWordCharMap[c - 'a']++
            }
            // Now we have both maps, so we compare both maps so that every word in wordCharMap is in currentWordMap

            for (mapIndex in 0..25) {
                wordCharMap[mapIndex] = Math.min(wordCharMap[mapIndex], currentWordCharMap[mapIndex])
            }
        }

        val output = mutableListOf<String>()
        for (index in 0..25) {
            for (secondIndex in 0 until wordCharMap[index]) {
                output.add("${(index + 97).toChar()}")
            }
        }

        return output
    }
}