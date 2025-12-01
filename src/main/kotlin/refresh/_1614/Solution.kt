package refresh._1614

class Solution {

    fun maxDepth(s: String): Int {
        var mnd = 0
        var parentheses = 0

        for (c in s) {
            if (c == '(') {
                parentheses++
            } else if (c == ')') {
                parentheses--
            }
            if (parentheses > mnd) {
                mnd = parentheses
            }
        }

        return mnd
    }
}