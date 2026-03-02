package refresh._1150

class Solution {

    fun isMajorityElement(nums: IntArray, target: Int): Boolean {
        var l = 0
        var r = nums.size - 1
        var pos = -1

        while (l <= r) {
            val m = (l + r) ushr 1
            if (nums[m] == target) {
                pos = m
                r = m - 1
            } else if (nums[m] > target) {
                r = m - 1
            } else {
                l = m + 1
            }
        }

        return if (pos == -1) {
            false
        } else {
            pos + (nums.size / 2) < nums.size && nums[pos + (nums.size / 2)] == target
        }
    }
}