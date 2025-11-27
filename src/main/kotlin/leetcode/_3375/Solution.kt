package leetcode._3375

class Solution {

    fun minOperations(nums: IntArray, k: Int): Int {
        val set = mutableSetOf<Int>()

        for (num in nums) {
            if (num > k) {
                set.add(num)
            } else if (num < k) {
                return -1
            }
        }

        return set.size
    }
}