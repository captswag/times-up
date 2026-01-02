package refresh._819

class Solution {

    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        val bannedSet = mutableSetOf<String>()
        for (b in banned) {
            bannedSet.add(b)
        }

        var i = 0
        val sb = StringBuilder()
        val map = mutableMapOf<String, Int>()
        var maxCount = 0

        while (i < paragraph.length) {
            while (i < paragraph.length && paragraph[i].isLetter()) {
                sb.append(
                    if (paragraph[i].isUpperCase()) {
                        paragraph[i].lowercase()
                    } else {
                        paragraph[i]
                    }
                )
                i++
            }
            val word = sb.toString()
            if (word.isNotEmpty() && word !in bannedSet) {
                map[word] = map.getOrDefault(word, 0) + 1
                if (map.getValue(word) > maxCount) {
                    maxCount = map.getValue(word)
                }
            }

            sb.setLength(0)
            i++
        }

        for (key in map.keys) {
            if (map.getValue(key) == maxCount) {
                return key
            }
        }

        return ""
    }
}