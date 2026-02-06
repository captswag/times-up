package refresh._3173

class Solution {

    fun orArray(nums: IntArray): IntArray {
        val ans = IntArray(nums.size - 1)

        for (i in 0 until nums.size - 1) {
            ans[i] = nums[i] or nums[i + 1]
        }

        return ans
    }
}