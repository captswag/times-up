package refresh._747

class Solution {

    fun dominantIndex(nums: IntArray): Int {
        var index = 0
        var largestIndex = index++
        var isLargest = true

        while (index < nums.size) {
            if (nums[index] == nums[largestIndex]) {
                isLargest = false
            } else if (nums[index] > nums[largestIndex]) {
                isLargest = nums[index] >= nums[largestIndex] * 2
                largestIndex = index
            } else if (nums[index] * 2 > nums[largestIndex]) {
                isLargest = false
            }
            index++
        }

        return if (isLargest) {
            largestIndex
        } else {
            -1
        }
    }
}