package refresh._2460

class Solution {

    fun applyOperations(nums: IntArray): IntArray {
        var i = 0
        while (i < nums.size - 1) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2
                nums[i + 1] = 0
                i += 2
            } else {
                i++
            }
        }

        i = 0
        var j = 0

        while (i < nums.size) {
            if (nums[i] != 0) {
                val tmp = nums[i]
                nums[i] = nums[j]
                nums[j] = tmp
                j++
            }
            i++
        }

        return nums
    }
}