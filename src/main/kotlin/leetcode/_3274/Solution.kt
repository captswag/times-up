package leetcode._3274

class Solution {

    fun checkTwoChessboards(coordinate1: String, coordinate2: String): Boolean {
        return row(coordinate1[1]) + column(coordinate1[0]) and 1 == row(coordinate2[1]) + column(coordinate2[0]) and 1
    }

    private fun row(r: Char): Int {
        return r - '0'
    }

    private fun column(c: Char): Int {
        return c - 'a'
    }
}