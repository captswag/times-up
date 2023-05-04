package leetcode._2404

class Solution {

    fun mostFrequentEven(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        var largestCount = 0

        for (num in nums) {
            if (num % 2 == 0) {
                val count = map.getOrDefault(num, 0) + 1
                map[num] = count
                if (count > largestCount) {
                    largestCount = count
                }
            }
        }


        return if (map.isEmpty()) {
            -1
        } else {
            var output = Integer.MAX_VALUE
            for (key in map.keys) {
                if (map[key] == largestCount) {
                    if (key < output) {
                        output = key
                    }
                }
            }
            output
        }
    }
}