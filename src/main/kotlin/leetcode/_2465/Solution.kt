package leetcode._2465

import java.util.*

class Solution {

    fun distinctAverages(nums: IntArray): Int {
        Arrays.sort(nums)
        val distinctAverages = mutableSetOf<Int>()
        var first = 0
        var last = nums.size - 1
        while (first < last) {
            distinctAverages.add(nums[first++] + nums[last--])
        }
        return distinctAverages.size
    }
}