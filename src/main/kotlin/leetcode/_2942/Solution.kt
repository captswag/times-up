package leetcode._2942

class Solution {

    fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
        val output = mutableListOf<Int>()

        for (index in words.indices) {
            for (c in words[index]) {
                if (c == x) {
                    output.add(index)
                    break
                }
            }
        }

        return output
    }
}