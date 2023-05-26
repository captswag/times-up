package leetcode._1133

class Solution {
    fun largestUniqueNumber(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()

        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }

        var output = -1
        for (num in nums) {
            if (map.getOrDefault(num, 0) == 1) {
                output = Math.max(num, output)
            }
        }

        return output
    }
}