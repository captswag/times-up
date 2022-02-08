package leetcode._1844

class Solution {
    fun replaceDigits(s: String): String {
        val output = s.toCharArray()
        for (index in 1 until output.size step 2) {
            val char = output[index - 1]
            val currentCharValue = char - 'a' + Character.getNumericValue(output[index])
            val currentChar = (currentCharValue + 97).toChar()
            output[index] = currentChar
        }
        return String(output)
    }
}