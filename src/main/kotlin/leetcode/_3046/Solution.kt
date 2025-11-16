package leetcode._3046

class Solution {

    fun isPossibleToSplit(nums: IntArray): Boolean {
        val map = mutableMapOf<Int, Int>()
        var output = true

        for (num in nums) {
            if (map.contains(num)) {
                val newCount = map.getOrDefault(num, 0) + 1
                if (newCount > 2) {
                    output = false
                    break
                } else {
                    map[num] = newCount
                }
            } else {
                map[num] = 1
            }
        }

        return output
    }
}