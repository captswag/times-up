package leetcode._500

class Solution {
    fun findWords(words: Array<String>): Array<String> {
        val output = mutableListOf<String>()
        val map = hashMapOf(
            'a' to 1,
            's' to 1,
            'd' to 1,
            'f' to 1,
            'g' to 1,
            'h' to 1,
            'j' to 1,
            'k' to 1,
            'l' to 1,
            'q' to 2,
            'w' to 2,
            'e' to 2,
            'r' to 2,
            't' to 2,
            'y' to 2,
            'u' to 2,
            'i' to 2,
            'o' to 2,
            'p' to 2,
            'z' to 3,
            'x' to 3,
            'c' to 3,
            'v' to 3,
            'b' to 3,
            'n' to 3,
            'm' to 3
        )

        for (word in words) {
            var belongsIn: Int? = null

            for (index in word.indices) {
                val char = word[index].toLowerCase()
                if (index == 0) {
                    if (index == word.length - 1) {
                        output.add(word)
                        break
                    } else {
                        belongsIn = map[char]
                    }
                } else if (index == word.length - 1 && belongsIn == map[char]) {
                    output.add(word)
                } else if (belongsIn != map[char]) {
                    break
                }
            }
        }

        return output.toTypedArray()
    }
}