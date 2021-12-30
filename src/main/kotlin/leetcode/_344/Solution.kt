package leetcode._344

class Solution {
    fun reverseString(s: CharArray): Unit {
        var startIndex = 0
        var endIndex = s.size - 1

        while (startIndex < endIndex) {
            // Swap the values at indexes
            val temp = s[startIndex]
            s[startIndex] = s[endIndex]
            s[endIndex] = temp

            startIndex++
            endIndex--
        }
    }
}