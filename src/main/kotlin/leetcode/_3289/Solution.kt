package leetcode._3289

class Solution {

    fun getSneakyNumbers(nums: IntArray): IntArray {
        var i = 0
        val seen = BooleanArray(101)
        val ans = IntArray(2)
        var k = 0

        while (k < 2) {
            if (seen[nums[i]]) {
                ans[k++] = nums[i]
            } else {
                seen[nums[i]] = true
            }
            i++
        }

        return ans
    }
}