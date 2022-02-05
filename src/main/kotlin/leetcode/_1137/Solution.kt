package leetcode._1137

class Solution {
    fun tribonacci(n: Int): Int {
        var prev = 0
        var current = 1
        var next = 1

        var output = 0
        for (index in 0..n) {
            if (index == 0) {
                output = prev
            } else if (index == 1) {
                output = current
            } else if (index == 2) {
                output = next
            } else {
                output = prev + current + next
                prev = current
                current = next
                next = output
            }
        }

        return output
    }
}