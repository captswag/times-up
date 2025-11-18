package leetcode._3151

class Solution {

    fun isArraySpecial(nums: IntArray): Boolean {
        var output = true

        for (index in 0 until nums.size - 2) {
            val flag = nums[index] % 2 == 0

            if (nums[index + 1] % 2 == 0) {
                if (flag) {
                    output = false
                    break
                }
            } else {
                if (!flag) {
                    output = false
                    break
                }
            }
        }

        return output
    }
}