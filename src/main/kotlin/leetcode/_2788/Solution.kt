package leetcode._2788

class Solution {

    fun splitWordsBySeparator(words: List<String>, separator: Char): List<String> {
        val output = mutableListOf<String>()

        for (word in words) {
            val sb = StringBuilder()
            for (index in 0..word.length) {
                if (index == word.length || word[index] == separator) {
                    if (sb.isNotEmpty()) {
                        output.add(String(sb))
                        sb.clear()
                    }
                } else {
                    sb.append(word[index])
                }
            }
        }

        return output
    }
}