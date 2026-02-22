package refresh._219

class Solution {

    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val pos = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            if (pos.containsKey(nums[i]) && i - pos.getValue(nums[i]) <= k) {
                return true
            }
            pos[nums[i]] = i
        }

        return false
    }
}