package leetcode._1295

class Solution {
    fun findNumbers(nums: IntArray): Int {
        var output = 0
        for (num in nums) {
            when (num) {
                in 10..99, in 1000..9999, in 100000..999999 -> output++
            }
        }
        return output
    }
}