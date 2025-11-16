package leetcode._3038

class Solution {

    fun maxOperations(nums: IntArray): Int {
        var index = 0
        val score = nums[index] + nums[++index]
        var output = 1

        index++
        while (nums.size - index >= 2) {
            if (score == nums[index] + nums[++index]) {
                output++
                index++
            } else {
                break
            }
        }

        return output
    }
}