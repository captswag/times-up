package leetcode._2855

class Solution {

    fun minimumRightShifts(nums: List<Int>): Int {
        var rotationPoint = -1

        for (index in 1 until nums.size) {
            if (nums[index] < nums[index - 1]) {
                if (rotationPoint == -1) {
                    rotationPoint = index
                } else {
                    // Found two rotation points.
                    return -1
                }
            }
        }

        return if (rotationPoint == -1) { // Found no rotation point
            0
        } else {
            if (nums[nums.size - 1] < nums[0]) {
                nums.size - rotationPoint
            } else {
                -1
            }
        }
    }
}