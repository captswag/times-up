package refresh._2535

import kotlin.math.abs

class Solution {

    fun differenceOfSum(nums: IntArray): Int {
        var sum = 0
        var ds = 0

        for (x in nums) {
            var n = x
            sum += n
            while (n != 0) {
                ds += (n % 10)
                n /= 10
            }
        }

        return abs(sum - ds)
    }
}