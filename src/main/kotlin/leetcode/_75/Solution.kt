package leetcode._75

class Solution {

    fun sortColors(nums: IntArray): Unit {
        var low = -1
        var high = nums.size
        var index = 0

        while (index < high) {
            if (nums[index] == 0) {
                val temp = nums[++low]
                nums[low] = nums[index]
                nums[index] = temp
                index++
            } else if (nums[index] == 1) {
                index++
            } else {
                val temp = nums[--high]
                nums[high] = nums[index]
                nums[index] = temp
                if (nums[index] == 1) {
                    index++
                }
            }
        }
    }
}