package leetcode._1941

class Solution {
    fun areOccurrencesEqual(s: String): Boolean {
        /**
         * Just add all the characters to a map along with their occurrences count.
         * After that iterate over each key, and find if all the counts match.
         */
        val map = mutableMapOf<Char, Int>()

        for (c in s) {
            val count = map[c]
            if (count == null) {
                map[c] = 1
            } else {
                map[c] = count + 1
            }
        }

        var prevCount: Int? = null
        var output = true
        for (key in map.keys) {
            if (prevCount == null) {
                prevCount = map[key]
            } else if (prevCount != map[key]) {
                output = false
            } else {
                prevCount = map[key]
            }
        }

        return output
    }
}