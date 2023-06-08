package leetcode._2367

class Solution {

    fun arithmeticTriplets(nums: IntArray, diff: Int): Int {
        val set = mutableSetOf<Int>()
        var tripletsCount = 0

        for (num in nums) {
            set.add(num)
        }

        for (num in nums) {
            if (set.contains(num + diff) && set.contains(num + (diff * 2))) {
                tripletsCount++
            }
        }

        return tripletsCount
    }
}