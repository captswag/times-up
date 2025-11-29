package leetcode._3707

class Solution {

    fun scoreBalance(s: String): Boolean {
        var totalSum = 0

        for (c in s) {
            totalSum += c - 'a' + 1
        }

        var sum = 0
        for (c in s) {
            sum += c - 'a' + 1
            if (sum * 2 == totalSum) {
                return true
            }
        }

        return false
    }
}