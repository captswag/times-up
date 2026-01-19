package refresh._2148

class Solution {

    fun countElements(nums: IntArray): Int {
        var i = 0
        var min = nums[i]
        var max = nums[i]
        i++

        while (i < nums.size) {
            if (nums[i] > max) {
                max = nums[i]
            } else if (nums[i] < min) {
                min = nums[i]
            }
            i++
        }

        i = 0
        var count = 0
        while (i < nums.size) {
            if (nums[i] in (min + 1) until max) {
                count++
            }
            i++
        }

        return count
    }
}