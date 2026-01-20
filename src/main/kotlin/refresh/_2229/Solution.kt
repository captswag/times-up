package refresh._2229

class Solution {

    fun isConsecutive(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()
        var min = Integer.MAX_VALUE

        for (num in nums) {
            set.add(num)
            if (num < min) {
                min = num
            }
        }

        for (num in min + 1 until min + nums.size) {
            if (num !in set) {
                return false
            }
        }

        return true
    }
}