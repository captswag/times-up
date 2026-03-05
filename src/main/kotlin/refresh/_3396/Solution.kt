package refresh._3396

class Solution {

    fun minimumOperations(nums: IntArray): Int {
        var i = nums.size - 1
        val seen = BooleanArray(101)

        while (i >= 0 && !seen[nums[i]]) {
            seen[nums[i]] = true
            i--
        }

        return (i + 3) / 3
    }
}