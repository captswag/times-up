package refresh._905

class Solution {

    fun sortArrayByParity(nums: IntArray): IntArray {
        var left = 0
        var right = nums.size - 1

        while (left < right) {
            if (nums[left] and 1 == 0) {
                left++
            } else {
                val temp = nums[left]
                nums[left] = nums[right]
                nums[right] = temp
                right--
            }
        }

        return nums
    }
}