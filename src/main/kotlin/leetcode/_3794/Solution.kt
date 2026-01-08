package leetcode._3794

class Solution {

    fun reversePrefix(s: String, k: Int): String {
        var left = 0
        var right = k - 1
        val c = s.toCharArray()

        while (left < right) {
            val temp = c[left]
            c[left] = c[right]
            c[right] = temp
            left++
            right--
        }

        return String(c)
    }
}