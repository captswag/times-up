package refresh._2855

class Solution {

    fun minimumRightShifts(nums: List<Int>): Int {
        var i = 1

        while (i < nums.size && nums[i] > nums[i - 1]) {
            i++
        }

        if (i == nums.size) {
            return 0
        } else {
            val j = i
            i++
            while (i < nums.size && nums[i] > nums[i - 1]) {
                i++
            }

            return if (i == nums.size) {
                if (nums[nums.size - 1] < nums[0]) {
                    nums.size - j
                } else {
                    -1
                }
            } else {
                -1
            }
        }
    }
}