package refresh._1021

class Solution {

    fun removeOuterParentheses(s: String): String {
        var index = 1
        var openBraceCount = 1
        val sb = StringBuilder()

        while (index < s.length) {
            if (s[index] == '(') {
                openBraceCount++
                if (openBraceCount > 1) {
                    sb.append('(')
                }
            } else {
                openBraceCount--
                if (openBraceCount > 0) {
                    sb.append(')')
                }
            }
            index++
        }

        return sb.toString()
    }
}