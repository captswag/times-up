package leetcode._2293

class Solution {

    fun minMaxGame(nums: IntArray): Int {
        var size = nums.size

        while (size != 1) {
            var min = true

            for ((index, current) in (1 until size step 2).withIndex()) {
                if (min) {
                    nums[index] = Math.min(nums[current - 1], nums[current])
                } else {
                    nums[index] = Math.max(nums[current - 1], nums[current])
                }
                min = !min
            }

            size /= 2
        }

        return nums[0]
    }
}