package leetcode._2395

class Solution {

    fun findSubarrays(nums: IntArray): Boolean {
        var subarrays = false
        val set = mutableSetOf<Int>()

        for (index in 1 until nums.size) {
            val sum = nums[index] + nums[index - 1]
            if (set.contains(sum)) {
                subarrays = true
                break
            } else {
                set.add(sum)
            }
        }

        return subarrays
    }
}