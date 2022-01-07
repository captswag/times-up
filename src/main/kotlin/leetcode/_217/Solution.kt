package leetcode._217

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val map = mutableMapOf<Int, Int>()
        var output = false

        for (num in nums) {
            val count = map[num]
            if (count == null) {
                map[num] = 1
            } else {
                map[num] = count + 1
            }
        }

        for (key in map.keys) {
            val count = map[key]
            if (count != null && count > 1) {
                output = true
                break
            }
        }

        return output
    }
}