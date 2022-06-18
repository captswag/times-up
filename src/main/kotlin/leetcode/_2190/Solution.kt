package leetcode._2190

class Solution {
    fun mostFrequent(nums: IntArray, key: Int): Int {
        val map = mutableMapOf<Int, Int>()

        for (index in 0..nums.size - 2) {
            if (nums[index] == key) {
                map[nums[index + 1]] = map.getOrDefault(nums[index + 1], 0) + 1
            }
        }

        var maxKey = -1
        var maxValue = -1
        for (mapKey in map.keys) {
            val count = map[mapKey]
            if (count != null && count > maxValue) {
                maxValue = count
                maxKey = mapKey
            }
        }

        return maxKey
    }
}