package leetcode._1389

class Solution {

    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
        val targetArray = IntArray(nums.size)

        for (i in index.indices) {
            for (j in targetArray.size - 1 downTo index[i] + 1) {
                targetArray[j] = targetArray[j - 1]
            }
            targetArray[index[i]] = nums[i]
        }

        return targetArray
    }
}