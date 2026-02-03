package refresh._2562

import java.util.*

class Solution {

    fun findTheArrayConcVal(nums: IntArray): Long {
        var l = 0
        var r = nums.size - 1
        var sum = 0L

        while (l <= r) {
            if (l == r) {
                sum += nums[l]
            } else {
                var cur = nums[l]
                var x = nums[r]
                val stk = Stack<Int>()

                while (x != 0) {
                    stk.push(x % 10)
                    x /= 10
                }

                while (stk.isNotEmpty()) {
                    cur = (cur * 10) + stk.pop()
                }
                sum += cur
            }
            l++
            r--
        }

        return sum
    }
}