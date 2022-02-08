package leetcode._1512

class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()

        for (num in nums) {
            val count = map[num]
            if (count == null) {
                map[num] = 1
            } else {
                map[num] = count + 1
            }
        }

        var output = 0
        for (num in nums) {
            val count = map[num]
            if (count != null) {
                if (count == 1) {
                    map.remove(num)
                } else {
                    output += count - 1
                    map[num] = count - 1
                }
            }
        }

        return output
    }
}