package leetcode._1748

class Solution {
    fun sumOfUnique(nums: IntArray): Int {
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
        for (key in map.keys) {
            val count = map[key]
            if (count != null && count == 1) {
                output += key
            }
        }

        return output
    }
}