package leetcode._441

class Solution {
    fun arrangeCoins(n: Int): Int {
        // We can solve this problem using binary search
        var low = 1L
        var high = n.toLong()
        var output = 0L

        while (low <= high) {
            val mid: Long = low + (high - low) / 2

            val k = (mid * (mid + 1)) / 2
            if (k <= n) {
                // We found a staircase which matches
                output = mid
                low = mid + 1
            } else {
                high = mid - 1
            }
        }

        return output.toInt()
    }
}