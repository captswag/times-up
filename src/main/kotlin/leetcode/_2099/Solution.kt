package leetcode._2099

import java.util.*

class Solution {
    fun maxSubsequence(nums: IntArray, k: Int): IntArray {
        val queue = PriorityQueue<Int>()
        for (num in nums) {
            queue.offer(num)
            if (queue.size > k) {
                queue.poll()
            }
        }

        val map = mutableMapOf<Int, Int>()
        while (queue.isNotEmpty()) {
            val value = queue.poll()
            map[value] = map.getOrDefault(value, 0) + 1
        }

        val output = IntArray(k)
        var kIndex = 0
        for (index in nums.indices) {
            if (nums[index] in map.keys) {
                val count = map[nums[index]]
                if (count != null) {
                    if (count == 1) {
                        map.remove(nums[index])
                    } else {
                        map[nums[index]] = count - 1
                    }
                }
                output[kIndex] = nums[index]
                kIndex++
            }
        }
        return output
    }
}