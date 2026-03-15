package leetcode._3870

class Solution {

    fun countCommas(n: Int): Int {
        return if (n >= 1000) {
            n - 1000 + 1
        } else {
            0
        }
    }
}