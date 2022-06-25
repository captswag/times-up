package leetcode._1056

class Solution {
    fun confusingNumber(n: Int): Boolean {
        var number = n
        val map = hashMapOf(0 to 0, 1 to 1, 6 to 9, 8 to 8, 9 to 6)
        var output = true
        var flip = 0
        val multiplier = 10

        while (number != 0) {
            val remainder = number % 10
            if (remainder !in map.keys) {
                output = false
                break
            }
            number /= 10
            flip = flip * multiplier + map.getOrDefault(remainder, -1)
        }

        return output && flip != n
    }
}