package leetcode._2125

class Solution {

    fun numberOfBeams(bank: Array<String>): Int {
        var prv = 0
        var ans = 0

        for (r in bank.indices) {
            var cur = 0
            for (c in bank[r].indices) {
                if (bank[r][c] == '1') {
                    cur++
                }
            }
            ans += (prv * cur)

            if (cur != 0) {
                prv = cur
            }
        }

        return ans
    }
}