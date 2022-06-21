package leetcode._219

class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = mutableMapOf<Int, Int>()
        var output = false

        for (index in nums.indices) {
            val prevIndex = map[nums[index]]
            if (prevIndex == null) {
                map[nums[index]] = index
            } else {
                if (index - prevIndex <= k) {
                    output = true
                    break
                } else {
                    map[nums[index]] = index
                }
            }
        }

        return output
    }
}