package leetcode._3718

class Solution {

    fun missingMultiple(nums: IntArray, k: Int): Int {
        val set = mutableSetOf<Int>()

        for (num in nums) {
            set.add(num)
        }

        var cur = k
        while (set.contains(cur)) {
            cur += k
        }

        return cur
    }
}