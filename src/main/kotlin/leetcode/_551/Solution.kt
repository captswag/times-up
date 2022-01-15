package leetcode._551

class Solution {
    fun checkRecord(s: String): Boolean {
        var absent = 0
        var late = 0
        var output = true

        for (c in s) {
            if (c == 'A') {
                absent++
                if (absent > 1) {
                    output = false
                    break
                }
                late = 0
            } else if (c == 'L') {
                late++
                if (late > 2) {
                    output = false
                    break
                }
            } else {
                late = 0
            }
        }

        return output
    }
}