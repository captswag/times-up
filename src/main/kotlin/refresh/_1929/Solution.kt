package refresh._1929

class Solution {

    fun getConcatenation(nums: IntArray): IntArray {
        val res = IntArray(nums.size * 2)

        for (i in nums.indices) {
            res[i] = nums[i]
            res[i + nums.size] = nums[i]
        }

        return res
    }
}