package leetcode._219

class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val set = mutableSetOf<Int>()
        var output = false

        for (index in nums.indices) {
            if (nums[index] in set) {
                output = true
                break
            } else {
                set.add(nums[index])
                if (index - k >= 0) {
                    set.remove(nums[index - k])
                }
            }
        }

        return output
    }
}