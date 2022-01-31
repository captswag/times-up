package leetcode._2006

class Solution {
    fun countKDifference(nums: IntArray, k: Int): Int {
        val map = mutableMapOf<Int, Int>()

        // First phase is to create a map with the count of each number
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
            val possibility1 = num - k
            val possibility2 = num + k

            val count1 = map[possibility1]
            val count2 = map[possibility2]

            if (count1 != null) {
                output += count1
            }

            if (count2 != null) {
                output += count2
            }

            // Reduce count of the current number in the map
            val count = map[num]
            if (count != null) {
                if (count == 1) {
                    map.remove(num)
                } else {
                    map[num] = count - 1
                }
            }
        }

        return output
    }
}