package leetcode._3846

import kotlin.math.abs

class Solution {

    fun totalDistance(s: String): Int {
        val rows = arrayOf("qwertyuiop", "asdfghjkl", "zxcvbnm")
        val pos = Array(26) { IntArray(2) }

        for (r in rows.indices) {
            for (c in rows[r].indices) {
                pos[rows[r][c] - 'a'][0] = r
                pos[rows[r][c] - 'a'][1] = c
            }
        }

        var prv = intArrayOf(1, 0)
        var ans = 0

        for (c in s) {
            ans += abs(pos[c - 'a'][0] - prv[0]) + abs(pos[c - 'a'][1] - prv[1])
            prv = pos[c - 'a']
        }

        return ans
    }
}