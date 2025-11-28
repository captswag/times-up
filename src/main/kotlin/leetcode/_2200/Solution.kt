package leetcode._2200

class Solution {

    fun findKDistantIndices(nums: IntArray, key: Int, k: Int): List<Int> {
        var nextStart = 0
        val res = mutableListOf<Int>()

        for (index in nums.indices) {
            if (nums[index] == key) {
                val left = Math.max(index - k, nextStart)
                val right = Math.min(index + k, nums.size - 1)
                for (j in left..right) {
                    res.add(j)
                }
                nextStart = right + 1
            }
        }

        return res
    }
}