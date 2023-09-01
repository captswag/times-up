package leetcode._2810

class Solution {

    fun finalString(s: String): String {
        var iCount = 0
        for (c in s) {
            if (c == 'i') {
                iCount++
            }
        }
        val charArray = CharArray(s.length - iCount)
        var low = 0
        var high = charArray.size - 1
        iCount = 0

        for (index in s.length - 1 downTo 0) {
            if (s[index] == 'i') {
                iCount++
            } else {
                if (iCount % 2 == 0) {
                    charArray[high--] = s[index]
                } else {
                    charArray[low++] = s[index]
                }
            }
        }

        return String(charArray)
    }
}