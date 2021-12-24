package leetcode._27

class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var valIndex: Int? = null

        for (index in nums.indices) {
            if (nums[index] == `val`) {
                valIndex = valIndex ?: index
            } else {
                // Swap index with valIndex
                if (valIndex != null) {
                    val temp = nums[valIndex]
                    nums[valIndex] = nums[index]
                    nums[index] = temp
                    valIndex++
                }
            }
        }

        return valIndex ?: nums.size
    }
}