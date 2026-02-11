package refresh._3674

class Solution {

    fun minOperations(nums: IntArray): Int {
        var same = true

        for (i in 1 until nums.size) {
            if (nums[i] != nums[i - 1]) {
                same = false
                break
            }
        }

        return if (same) {
            0
        } else {
            1
        }
    }
}