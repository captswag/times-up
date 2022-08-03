package leetcode._2269

class Solution {
    fun divisorSubstrings(num: Int, k: Int): Int {
        var multiplier = 1
        var current = 0
        var numValue = num
        var kValue = k
        var output = 0

        while (numValue != 0) {
            val rem = numValue % 10
            numValue /= 10

            if (kValue <= 0) {
                current /= 10
            }

            current += (rem * multiplier)

            if (kValue-- > 0 && kValue != 0) {
                multiplier *= 10
            }

            if (kValue <= 0 && current != 0 && num % current == 0) {
                output++
            }
        }

        return output
    }
}