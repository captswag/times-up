package leetcode._202

class Solution {
    fun isHappy(n: Int): Boolean {
        val output: Boolean
        val set = mutableSetOf<Int>()
        var number = n

        while (true) {
            var sum = 0
            while (number != 0) {
                val mod = number % 10
                number /= 10
                sum += mod * mod
            }
            // Now we have the sum
            if (sum == 1) {
                output = true
                break
            } else if (set.contains(sum)) {
                output = false
                break
            } else {
                set.add(sum)
            }

            number = sum
        }

        return output
    }
}