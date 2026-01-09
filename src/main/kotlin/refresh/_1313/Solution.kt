package refresh._1313

class Solution {

    fun decompressRLElist(nums: IntArray): IntArray {
        var size = 0

        for (i in nums.indices step 2) {
            size += nums[i]
        }

        val res = IntArray(size)
        var resIndex = 0

        for (i in nums.indices step 2) {
            for (j in 0 until nums[i]) {
                res[resIndex++] = nums[i + 1]
            }
        }

        return res
    }
}