package refresh._2395

class Solution {

    fun findSubarrays(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()

        for (i in 0 until nums.size - 1) {
            val sum = nums[i] + nums[i + 1]
            if (set.contains(sum)) {
                return true
            } else {
                set.add(sum)
            }
        }

        return false
    }
}