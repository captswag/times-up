package refresh._3550

class Solution {

    fun smallestIndex(nums: IntArray): Int {
        for (i in nums.indices) {
            var x = nums[i]
            var sum = 0

            while (x != 0) {
                sum += (x % 10)
                x /= 10
            }

            if (sum == i) {
                return i
            }
        }

        return -1
    }
}