package refresh._1389

class Solution {

    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
        val res = IntArray(nums.size)

        for (i in index.indices) {
            for (j in res.size - 1 downTo index[i] + 1) {
                res[j] = res[j - 1]
            }
            res[index[i]] = nums[i]
        }

        return res
    }
}