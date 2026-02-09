package refresh._3467

class Solution {

    fun transformArray(nums: IntArray): IntArray {
        var l = 0
        var r = nums.size - 1

        while (l <= r) {
            if (nums[l] and 1 == 0) {
                nums[l] = 0
                l++
            } else {
                nums[l] = 1
                val temp = nums[r]
                nums[r] = nums[l]
                nums[l] = temp
                r--
            }
        }

        return nums
    }
}