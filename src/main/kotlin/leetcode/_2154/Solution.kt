package leetcode._2154

class Solution {
    fun findFinalValue(nums: IntArray, original: Int): Int {
        val set = mutableSetOf<Int>()

        for (num in nums) {
            set.add(num)
        }

        var originalNumber = original
        while (set.contains(originalNumber)) {
            originalNumber *= 2
        }

        return originalNumber
    }
}