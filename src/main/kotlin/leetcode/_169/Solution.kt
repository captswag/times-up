package leetcode._169

class Solution {
    fun majorityElement(nums: IntArray): Int {
        var majorityElement = nums[0]
        var counter = 1

        for (index in 1 until nums.size) {
            if (counter == 0) {
                majorityElement = nums[index]
                counter = 1
            } else if (majorityElement == nums[index]) {
                counter++
            } else {
                counter--
            }
        }

        return majorityElement
    }
}