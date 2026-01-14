package refresh._1920

class Solution {

    fun buildArray(nums: IntArray): IntArray {
        val res = IntArray(nums.size)

        for (i in res.indices) {
            res[i] = nums[nums[i]]
        }

        return res
    }
}