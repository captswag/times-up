package leetcode._557

class Solution {
    fun reverseWords(s: String): String {
        val c = s.toCharArray()
        var start = 0

        while (start < c.size) {
            var end = start
            while (end < c.size && c[end] != ' ') {
                end++
            }
            reverse(c, start, end - 1)
            start = end + 1
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