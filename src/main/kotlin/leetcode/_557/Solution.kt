package leetcode._557

class Solution {
    fun reverseWords(s: String): String {
        var index = 0
        var startIndex: Int? = null
        val c = s.toCharArray()

        while (index <= c.size) {
            if (index == c.size || c[index] == ' ') {
                if (startIndex != null) {
                    reverse(c, startIndex, index - 1)
                    startIndex = null
                }
            } else {
                if (startIndex == null) {
                    startIndex = index
                }
            }
            index++
        }

        return String(c)
    }

    private fun reverse(c: CharArray, startIndex: Int, endIndex: Int) {
        var start = startIndex
        var end = endIndex
        while (start < end) {
            val temp = c[start]
            c[start] = c[end]
            c[end] = temp
            start++
            end--
        }
    }
}