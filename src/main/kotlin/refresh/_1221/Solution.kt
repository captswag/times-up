package refresh._1221

class Solution {

    fun balancedStringSplit(s: String): Int {
        var lCount = 0
        var rCount = 0
        var res = 0

        for (c in s) {
            if (c == 'R') {
                rCount++
            } else {
                lCount++
            }
            if (lCount == rCount) {
                res++
            }
        }

        return res
    }
}