package leetcode._2124

class Solution {
    fun checkString(s: String): Boolean {
        var bFlag = false
        var output = true

        for (c in s) {
            if (bFlag) {
                if (c == 'a') {
                    output = false
                    break
                }
            }
            if (c == 'b') {
                bFlag = true
            }
        }

        return output
    }
}