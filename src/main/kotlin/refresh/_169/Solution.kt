package refresh._169

class Solution {

    fun majorityElement(nums: IntArray): Int {
        var ans = nums[0]
        var cnt = 1

        for (i in 1 until nums.size) {
            if (cnt == 0) {
                ans = nums[i]
                cnt++
            } else if (nums[i] == ans) {
                cnt++
            } else {
                cnt--
            }
        }

        return ans
    }
}