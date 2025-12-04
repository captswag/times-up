package refresh._3392

class Solution {

    fun countSubarrays(nums: IntArray): Int {
        var count = 0

        for (index in 2 until nums.size) {
            if ((nums[index - 2] + nums[index]) * 2 == nums[index - 1]) {
                count++
            }
        }

        return count
    }
}