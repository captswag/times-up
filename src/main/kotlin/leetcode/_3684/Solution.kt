package leetcode._3684

import java.util.*

class Solution {

    fun maxKDistinct(nums: IntArray, k: Int): IntArray {
        val set = TreeSet<Int>(compareByDescending { it })

        for (num in nums) {
            set.add(num)
        }

        val result = IntArray(Math.min(k, set.size))
        for (index in result.indices) {
            val num = set.first()
            result[index] = num
            set.remove(num)
        }

        return result
    }
}