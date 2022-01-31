package leetcode._283

import extentions.displayFormatted

class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var current = 0
        var previous = 0 // This will be previous as we move on with the iteration (as long as there are zeroes)
        while (current < nums.size) {
            if (nums[current] != 0) {
                val temp = nums[previous]
                nums[previous] = nums[current]
                nums[current] = temp
                previous++
            }
            current++
        }
        nums.displayFormatted()
    }
}