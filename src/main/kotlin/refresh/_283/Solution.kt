package refresh._283

class Solution {

    fun moveZeroes(nums: IntArray): Unit {
        var l = 0
        var r = 0

        while (r < nums.size) {
            if (nums[r] != 0) {
                val temp = nums[l]
                nums[l] = nums[r]
                nums[r] = temp
                l++
            }
            r++
        }
    }
}