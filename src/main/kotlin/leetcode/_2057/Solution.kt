package leetcode._2057

class Solution {
    fun smallestEqual(nums: IntArray): Int {
        var output = -1
        var index = 0
        while (index < nums.size) {
            if (index % 10 == nums[index]) {
                output = index
                break
            }
            index++
        }
        return output
    }
}