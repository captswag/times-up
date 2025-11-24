package leetcode._3174

class Solution {

    fun clearDigits(s: String): String {
        val charArray = s.toCharArray()
        var size = 0

        for (c in s) {
            when (c) {
                in 'a'..'z' -> {
                    charArray[size++] = c
                }
                in '0'..'9' -> {
                    size--
                }
            }
        }

        return String(charArray, 0, size)
    }
}