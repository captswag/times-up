package leetcode._2255

class Solution {
    fun countPrefixes(words: Array<String>, s: String): Int {
        var output = 0

        for (word in words) {
            var wordIndex = 0
            var isPrefix = false
            for (c in s) {
                if (c == word[wordIndex]) {
                    if (wordIndex == word.length - 1) {
                        isPrefix = true
                        break
                    } else {
                        wordIndex++
                    }
                } else {
                    break
                }
            }
            if (isPrefix) {
                output++
            }
        }

        return output
    }
}