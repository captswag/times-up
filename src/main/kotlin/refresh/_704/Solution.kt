package refresh._704

class Solution {

    fun search(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.size - 1

        while (l <= r) {
            val m = (l + r) ushr 1
            if (nums[m] == target) {
                return m
            } else if (nums[m] < target) {
                l = m + 1
            } else {
                r = m - 1
            }
        }

        return -1
    }
}