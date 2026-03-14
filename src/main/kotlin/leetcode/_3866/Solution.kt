package leetcode._3866

class Solution {

    fun firstUniqueEven(nums: IntArray): Int {
        val cnt = IntArray(101)

        for (x in nums) {
            cnt[x]++
        }

        for (x in nums) {
            if (x and 1 == 0 && cnt[x] == 1) {
                return x
            }
        }

        return -1
    }
}