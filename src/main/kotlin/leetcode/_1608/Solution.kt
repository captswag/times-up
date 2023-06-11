package leetcode._1608

import java.util.*

class Solution {

    fun specialArray(nums: IntArray): Int {
        Arrays.sort(nums)
        var output = -1

        for (x in nums.size downTo 1) {
            var low = 0
            var high = nums.size - 1
            var searchIndex = nums.size

            while (low <= high) {
                val mid = (low + high) ushr 1

                if (nums[mid] < x) {
                    low = mid + 1
                } else {
                    searchIndex = mid
                    high = mid - 1
                }
            }

            if (x == nums.size - searchIndex) {
                output = x
                break
            }
        }

        return output
    }
}