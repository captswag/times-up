package leetcode._3069

class Solution {

    fun resultArray(nums: IntArray): IntArray {
        val res = IntArray(nums.size)
        var resSize = 0
        val arr2 = IntArray(nums.size - 1)
        var arr2Size = 0
        res[resSize++] = nums[0]
        arr2[arr2Size++] = nums[1]

        for (i in 2 until nums.size) {
            if (res[resSize - 1] > arr2[arr2Size - 1]) {
                res[resSize++] = nums[i]
            } else {
                arr2[arr2Size++] = nums[i]
            }
        }

        for (i in 0 until arr2Size) {
            res[resSize++] = arr2[i]
        }

        return res
    }
}