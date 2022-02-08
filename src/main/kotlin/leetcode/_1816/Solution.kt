package leetcode._1816

class Solution {
    fun truncateSentence(s: String, k: Int): String {
        var wordCounter = 0
        val output = StringBuilder()

        for (c in s) {
            if (c == ' ') {
                wordCounter++

                if (wordCounter == k) {
                    break
                }
            }
            output.append(c)
        }

        return output.toString()
    }
}