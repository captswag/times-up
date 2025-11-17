package leetcode._3467

class Solution {

    fun transformArray(nums: IntArray): IntArray {
        var even = 0
        var odd = 0

        for (num in nums) {
            if (num % 2 == 0) {
                even++
            } else {
                odd++
            }
        }

        val output = IntArray(nums.size)
        for (index in output.indices) {
            if (index < even) {
                output[index] = 0
            } else {
                output[index] = 1
            }
        }

        return output
    }
}