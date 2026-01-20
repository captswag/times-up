package refresh._2210

class Solution {

    fun countHillValley(nums: IntArray): Int {
        var i = 0
        var prev = nums[i++]

        while (i < nums.size - 1 && nums[i] == prev) {
            i++
        }

        var count = 0
        while (i < nums.size - 1) {
            var j = i + 1

            while (j < nums.size && nums[j] == nums[i]) {
                j++
            }
            if (j != nums.size) {
                if ((prev < nums[i] && nums[j] < nums[i]) || (prev > nums[i] && nums[j] > nums[i])) {
                    count++
                }
            }

            prev = nums[i]
            i = j
        }

        return count
    }
}