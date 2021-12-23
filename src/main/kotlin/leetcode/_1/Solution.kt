package leetcode._1

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val output = IntArray(2)

        val map = HashMap<Int, Int>()

        for (index in nums.indices) {
            if (map.containsKey(nums[index])) {
                // Return index and the value in map[index]
                output[0] = map[nums[index]]!!
                output[1] = index
            } else {
                val sub = target - nums[index]
                map[sub] = index
            }
        }

        return output
    }
}