package leetcode._1021

class Solution {

    fun removeOuterParentheses(s: String): String {
        var count = 1
        val result = StringBuilder()

        for (index in 1 until s.length) {
            if (s[index] == '(') {
                count++
                if (count != 1) {
                    result.append(s[index])
                }
            } else {
                count--
                if (count != 0) {
                    result.append(s[index])
                }
            }
        }

        return result.toString()
    }
}