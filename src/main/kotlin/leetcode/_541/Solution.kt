package leetcode._541

class Solution {
    fun reverseStr(s: String, k: Int): String {
        val c = s.toCharArray()

        var start: Int? = null
        var reverseFlag = true
        for (index in s.indices) {
            if ((index + 1) % k == 0) {
                if (reverseFlag) {
                    if (start != null) {
                        reverse(c, start, index)
                        start = null
                        reverseFlag = false
                    }
                } else {
                    reverseFlag = true
                    start = null
                }
            } else {
                if (start == null) {
                    start = index
                }
            }
        }

        if (reverseFlag && start != null) {
            reverse(c, start, c.size - 1)
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