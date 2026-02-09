package refresh._3452

class Solution {

    fun sumOfGoodNumbers(nums: IntArray, k: Int): Int {
        var sum = 0

        for (i in nums.indices) {
            val l = i - k
            val r = i + k
            var good = true

            if (l > -1 && nums[l] >= nums[i]) {
                good = false
            }

            if (r < nums.size && nums[r] >= nums[i]) {
                good = false
            }

            if (good) {
                sum += nums[i]
            }
        }

        return sum
    }
}