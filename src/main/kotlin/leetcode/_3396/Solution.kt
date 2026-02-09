package leetcode._3396

import kotlin.math.min

class Solution {

    fun minimumOperations(nums: IntArray): Int {
        val freq = mutableMapOf<Int, Int>()

        for (num in nums) {
            freq[num] = freq.getOrDefault(num, 0) + 1
        }

        var i = 0
        var r = 3
        var cnt = 0

        while (freq.size != nums.size - i) {
            while (i < min(r, nums.size)) {
                if (freq[nums[i]] == 1) {
                    freq.remove(nums[i])
                } else {
                    freq[nums[i]] = freq.getValue(nums[i]) - 1
                }
                i++
            }
            r += 3
            cnt++
        }

        return cnt
    }
}