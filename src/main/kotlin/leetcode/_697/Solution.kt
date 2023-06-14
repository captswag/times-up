package leetcode._697

class Solution {
    fun findShortestSubArray(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        var maxDegree = 0

        for (num in nums) {
            val currDegree = map.getOrDefault(num, 0) + 1
            map[num] = currDegree
            maxDegree = Math.max(maxDegree, currDegree)
        }

        var minLength = Integer.MAX_VALUE
        for (key in map.keys) {
            if (map.getValue(key) == maxDegree) {
                var left = 0
                var right = nums.size - 1

                while (nums[left] != key) {
                    left++
                }

                while (nums[right] != key) {
                    right--
                }

                minLength = Math.min(minLength, right - left + 1)
            }
        }

        return minLength
    }
}