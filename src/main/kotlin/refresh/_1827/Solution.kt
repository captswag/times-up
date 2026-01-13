package refresh._1827

class Solution {

    fun minOperations(nums: IntArray): Int {
        var operations = 0

        for (i in 1 until nums.size) {
            if (nums[i] <= nums[i - 1]) {
                val target = nums[i - 1] + 1
                operations += (target - nums[i])
                nums[i] = target
            }
        }

        return operations
    }
}