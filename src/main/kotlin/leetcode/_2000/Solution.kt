package leetcode._2000

class Solution {
    fun reversePrefix(word: String, ch: Char): String {
        var firstOccurrence = -1
        for (index in word.indices) {
            if (word[index] == ch) {
                firstOccurrence = index
                break
            }
        }

        return if (firstOccurrence == -1) {
            word
        } else {
            val chars = word.toCharArray()
            var start = 0
            // firstOccurrence is the same as end

            while (start < firstOccurrence) {
                val temp = chars[start]
                chars[start] = chars[firstOccurrence]
                chars[firstOccurrence] = temp
                start++
                firstOccurrence--
            }

            String(chars)
        }
    }
}