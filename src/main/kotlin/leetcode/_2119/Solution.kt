package leetcode._2119

class Solution {
    fun isSameAfterReversal(num: Int): Boolean {
        return if (num == 0) {
            true
        } else {
            num % 10 != 0
        }
    }
}