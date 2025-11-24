package leetcode._3174

class Solution {

    fun clearDigits(s: String): String {
        val output = StringBuilder()

        for (c in s) {
            when (c) {
                in 'a'..'z' -> output.append(c)
                in '0'..'9' -> output.setLength(output.length - 1)
            }
        }

        return output.toString()
    }
}