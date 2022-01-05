package leetcode._709

class Solution {
    fun toLowerCase(s: String): String {
        val charArray = s.toCharArray()

        for (index in charArray.indices) {
            val ascii = charArray[index].toInt()
            if (ascii in 65..90) {
                val upperCase = (ascii + 32).toChar()
                charArray[index] = upperCase
            }
        }

        return String(charArray)
    }
}