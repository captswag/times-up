package leetcode._697

class Solution {
    fun findShortestSubArray(nums: IntArray): Int {
        val countMap = mutableMapOf<Int, Int>()
        val leftMap = mutableMapOf<Int, Int>()
        val rightMap = mutableMapOf<Int, Int>()

        for (index in nums.indices) {
            countMap[nums[index]] = countMap.getOrDefault(nums[index], 0) + 1

            val left = leftMap[nums[index]]
            if (left == null) {
                leftMap[nums[index]] = index
            } else {
                rightMap[nums[index]] = index
            }
        }

        var maxCount = -1
        var output = 1

        for (key in countMap.keys) {
            val count = countMap[key]
            if (count != null && count > 1 && count >= maxCount) {
                val left = leftMap[key]
                val right = rightMap[key]

                if (left != null && right != null) {
                    val diff = right - left
                    if (count > maxCount || diff < output) {
                        output = diff + 1
                    }
                }

                maxCount = count
            }
        }

        return output
    }
}