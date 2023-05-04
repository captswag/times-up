package leetcode._2441

class Solution {

    fun findMaxK(nums: IntArray): Int {
        var output = -1
        val set = mutableSetOf<Int>()

        for (num in nums) {
            if (num >= 0) {
                set.add(num)
            }
        }

        for (num in nums) {
            val number = num * -1
            if (num < 0 && set.contains(number) && number > output) {
                output = number
            }
        }

        return output
    }
}