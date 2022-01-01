package leetcode._9

class Solution {
    fun isPalindrome(x: Int): Boolean {
        var output = true

        if (x < 0) {
            output = false
        } else {
            // Now we have to reverse the number without converting to Int
            var number = x
            var reverse = 0

            while (number != 0) {
                val rem = number % 10
                number /= 10
                reverse = (reverse * 10) + rem
            }

            if (x != reverse) {
                output = false
            }
        }

        return output
    }
}