package leetcode._2515

class Solution {

    fun closetTarget(words: Array<String>, target: String, startIndex: Int): Int {
        var output = Integer.MAX_VALUE

        for (index in words.indices) {
            if (words[index] == target) {
                val steps = Math.abs(index - startIndex)
                output = Math.min(output, steps)
                output = Math.min(output, words.size - steps)
            }
        }

        return if (output == Integer.MAX_VALUE) {
            -1
        } else {
            output
        }
    }
}