package leetcode._1

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val output = IntArray(2)
        val map = mutableMapOf<Int, Int>()

        for (index in nums.indices) {
            val diff = target - nums[index]
            if (map.contains(diff)) {
                output[0] = map.getOrDefault(diff, 0)
                output[1] = index
            } else {
                map[nums[index]] = index
            }
        }

        return output
    }
}