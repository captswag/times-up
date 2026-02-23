package refresh._26

class Solution {

    fun removeDuplicates(nums: IntArray): Int {
        var i = 1
        var n = nums.size

        while (i < n) {
            if (nums[i] == nums[i - 1]) {
                for (j in i until n - 1) {
                    nums[j] = nums[j + 1]
                }
                n--
            } else {
                i++
            }
        }

        return n
    }
}