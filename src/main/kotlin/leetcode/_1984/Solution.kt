package leetcode._1984

import java.util.*

class Solution {

    fun minSubsequence(nums: IntArray): List<Int> {
        var remainingSum = 0
        val maxHeap = PriorityQueue<Int> { a, b -> b - a }

        for (num in nums) {
            remainingSum += num
            maxHeap.add(num)
        }

        var selectedSum = 0
        val res = mutableListOf<Int>()
        while (selectedSum <= remainingSum) {
            res.add(maxHeap.poll())
            selectedSum += res[res.size - 1]
            remainingSum -= res[res.size - 1]
        }

        return res
    }
}