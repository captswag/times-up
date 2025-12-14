package leetcode._3216

class Solution {

    fun getSmallestString(s: String): String {
        val c = s.toCharArray()

        for (index in 0 until c.size - 1) {
            val curr = c[index] - '0'
            val next = c[index + 1] - '0'

            if ((curr and 1 == next and 1) && curr > next) {
                val temp = c[index]
                c[index] = c[index + 1]
                c[index + 1] = temp
                break
            }
        }

        return String(c)
    }
}