package refresh._1614

class Solution {

    fun maxDepth(s: String): Int {
        var maxDepth = 0
        var currDepth = 0

        for (c in s) {
            if (c == '(') {
                currDepth++
                if (currDepth > maxDepth) {
                    maxDepth = currDepth
                }
            } else if (c == ')') {
                currDepth--
            }
        }

        return maxDepth
    }
}