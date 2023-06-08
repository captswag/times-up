package leetcode._2389

import java.util.*

class Solution {

    fun answerQueries(nums: IntArray, queries: IntArray): IntArray {
        Arrays.sort(nums)

        for (index in 1 until nums.size) {
            nums[index] = nums[index] + nums[index - 1]
        }

        for (index in queries.indices) {
            var low = 0
            var high = nums.size - 1

            var position = -1
            while (low <= high) {
                val mid = (low + high) ushr 1

                if (queries[index] < nums[mid]) {
                    high = mid - 1
                } else {
                    position = mid
                    low = mid + 1
                }
            }

            queries[index] = position + 1
        }

        return queries
    }
}