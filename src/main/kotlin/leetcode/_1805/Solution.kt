package leetcode._1805

class Solution {
    fun numDifferentIntegers(word: String): Int {
        val output = mutableSetOf<String>()
        var index = 0

        while (index < word.length) {
            if (word[index].isDigit()) {
                while (index < word.length && word[index] == '0') {
                    index++
                }
                val sb = StringBuilder()
                while (index < word.length && word[index].isDigit()) {
                    sb.append(word[index++])
                }
                output.add(String(sb))
            } else {
                index++
            }
        }

        return output.size
    }
}