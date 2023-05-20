package leetcode._2670

class Solution {

    fun distinctDifferenceArray(nums: IntArray): IntArray {
        val prefixSet = mutableSetOf<Int>()
        val suffixMap = mutableMapOf<Int, Int>()
        val output = IntArray(nums.size)

        for (num in nums) {
            suffixMap[num] = suffixMap.getOrDefault(num, 0) + 1
        }

        for (index in nums.indices) {
            prefixSet.add(nums[index])

            val count = suffixMap.getOrDefault(nums[index], 0) - 1
            if (count <= 0) {
                suffixMap.remove(nums[index])
            } else {
                suffixMap[nums[index]] = count
            }

            output[index] = prefixSet.size - suffixMap.keys.size
        }

        return output
    }
}