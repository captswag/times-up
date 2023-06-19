package leetcode._2099

import java.util.*

class Solution {
    fun maxSubsequence(nums: IntArray, k: Int): IntArray {
        val queue = PriorityQueue<Int> { a, b -> nums[a] - nums[b] }

        for (index in nums.indices) {
            queue.add(index)
            if (queue.size > k) {
                queue.remove()
            }
        }

        val maxArray = IntArray(k)
        for (index in maxArray.indices) {
            maxArray[index] = queue.remove()
        }
        maxArray.sort()

        for (index in maxArray.indices) {
            maxArray[index] = nums[maxArray[index]]
        }

        return maxArray
    }
}