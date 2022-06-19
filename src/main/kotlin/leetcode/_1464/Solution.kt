package leetcode._1464

class Solution {
    fun maxProduct(nums: IntArray): Int {
        var largest: Int
        var secondLargest: Int

        if (nums[0] > nums[1]) {
            largest = nums[0]
            secondLargest = nums[1]
        } else {
            largest = nums[1]
            secondLargest = nums[0]
        }

        for (index in 2 until nums.size) {
            if (nums[index] > largest) {
                secondLargest = largest
                largest = nums[index]
            } else if (nums[index] > secondLargest) {
                secondLargest = nums[index]
            }
        }

        return (largest - 1) * (secondLargest - 1)
    }
}