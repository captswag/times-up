package leetcode._509

class Solution {
    fun fib(n: Int): Int {
        var prev = 0
        var current = 1

        var output = 0
        for (index in 0..n) {
            if (index == 0) {
                output = prev
            } else if (index == 1) {
                output = current
            } else {
                output = prev + current
                prev = current
                current = output
            }
        }
        return output
    }
}