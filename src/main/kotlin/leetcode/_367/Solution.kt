package leetcode._367

class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        var low = 1
        var high = num
        var output = false

        while (low <= high) {
            val mid = low + (high - low) / 2

            val quo = num / mid
            val rem = num % mid

            if (quo == mid && rem == 0) {
                output = true
                break
            } else if (quo >= mid) {
                low = mid + 1
            } else {
                high = mid - 1
            }
        }

        return output
    }
}