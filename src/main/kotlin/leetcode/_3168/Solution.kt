package leetcode._3168

class Solution {

    fun minimumChairs(s: String): Int {
        var output = 0
        var eCount = 0

        for (c in s) {
            if (c == 'E') {
                if (++eCount > output) {
                    output = eCount
                }
            } else {
                eCount--
            }
        }

        return output
    }
}