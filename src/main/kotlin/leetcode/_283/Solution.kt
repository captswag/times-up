package leetcode._283

import extentions.displayFormatted

class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var positionOfFirstZero: Int? = null
        for (index in nums.indices) {
            if (nums[index] == 0) {
                positionOfFirstZero = positionOfFirstZero ?: index
            } else {
                if (positionOfFirstZero != null) {
                    // Swap the value of index with positionOfFirstZero
                    val temp = nums[positionOfFirstZero]
                    nums[positionOfFirstZero] = nums[index]
                    nums[index] = temp
                    positionOfFirstZero++
                }
            }
        }
        nums.displayFormatted()
    }
}