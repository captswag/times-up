package refresh._521

import kotlin.math.max

class Solution {

    fun findLUSlength(a: String, b: String): Int {
        return if (eq(a, b)) {
            -1
        } else {
            max(a.length, b.length)
        }
    }

    private fun eq(a: String, b: String): Boolean {
        var i = 0
        var j = 0
        while (i < a.length && j < b.length && a[i] == b[i]) {
            i++
            j++
        }

        return i == a.length && j == b.length
    }
}