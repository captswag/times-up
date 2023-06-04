package leetcode._521

class Solution {

    fun findLUSlength(a: String, b: String): Int {
        return if (a == b) {
            -1
        } else {
            Math.max(a.length, b.length)
        }
    }
}