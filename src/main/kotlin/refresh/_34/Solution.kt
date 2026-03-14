package refresh._34

class Solution {

    fun searchRange(nums: IntArray, target: Int): IntArray {
        val ans = intArrayOf(-1, -1)
        var l = 0
        var r = nums.size - 1

        while (l <= r) {
            val mid = (l + r) ushr 1

            if (nums[mid] == target) {
                ans[0] = mid
                r = mid - 1
            } else if (nums[mid] < target) {
                l = mid + 1
            } else {
                r = mid - 1
            }
        }

        if (ans[0] == -1) {
            return ans
        }

        l = 0
        r = nums.size - 1

        while (l <= r) {
            val mid = (l + r) ushr 1

            if (nums[mid] == target) {
                ans[1] = mid
                l = mid + 1
            } else if (nums[mid] < target) {
                l = mid + 1
            } else {
                r = mid - 1
            }
        }

        return ans
    }
}