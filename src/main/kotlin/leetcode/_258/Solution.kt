package leetcode._258

class Solution {
    fun addDigits(num: Int): Int {
        return if (num == 0) {
            0
        } else if (num % 9 == 0) {
            9
        } else {
            num % 9
        }
    }
}