package leetcode._3427

import kotlin.math.max

class Solution {

    fun subarraySum(nums: IntArray): Int {
        val a = IntArray(nums.size)
        a[0] = nums[0]

        for (i in 1 until a.size) {
            a[i] = nums[i] + a[i - 1]
        }

        var sum = 0
        for (i in a.indices) {
            val start = max(0, i - nums[i])
            sum += if (start == 0) {
                a[i]
            } else {
                a[i] - a[start - 1]
            }
        }

        return sum
    }
}