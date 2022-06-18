package leetcode._2229

class Solution {
    fun isConsecutive(nums: IntArray): Boolean {
        var smallest = Int.MAX_VALUE

        for (num in nums) {
            if (num < smallest) {
                smallest = num
            }
        }

        val largest = smallest + nums.size - 1

        val set = mutableSetOf<Int>()
        for (value in smallest..largest) {
            set.add(value)
        }

        for (num in nums) {
            set.remove(num)
        }

        return set.isEmpty()
    }
}