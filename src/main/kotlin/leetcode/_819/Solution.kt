package leetcode._819

class Solution {
    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        val sb = StringBuilder()
        val nonLetterSet = setOf(' ', '!', '?', ',', ';', '.', '"', '\'')
        val wordMap = mutableMapOf<String, Int>()
        val bannedSet = mutableSetOf<String>()

        for (word in banned) {
            bannedSet.add(word)
        }

        for (index in 0..paragraph.length) {
            if (index == paragraph.length || nonLetterSet.contains(paragraph[index])) {
                val word = sb.toString()
                sb.clear()
                if (word.isNotEmpty() && !bannedSet.contains(word)) {
                    // Check if the hashmap has it, if yes increment the count. Else add it.
                    val count = wordMap[word]
                    if (count == null) {
                        wordMap[word] = 1
                    } else {
                        wordMap[word] = count + 1
                    }
                }
            } else {
                sb.append(paragraph[index].toLowerCase())
            }
        }

        var maxOccurrence = -1
        var output = ""
        for (key in wordMap.keys) {
            val count = wordMap[key]
            if (count != null) {
                if (maxOccurrence < count) {
                    maxOccurrence = count
                    output = key
                }
            }
        }

        return output
    }
}