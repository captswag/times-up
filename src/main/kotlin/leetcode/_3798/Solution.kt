package leetcode._3798

class Solution {

    fun largestEven(s: String): String {
        val c = s.toCharArray()

        var index = c.size - 1
        while (index > -1) {
            if ((c[index] - '0') and 1 == 0) {
                break
            }
            index--
        }

        return String(c, 0, index + 1)
    }
}