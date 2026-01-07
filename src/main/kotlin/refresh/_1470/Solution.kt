package refresh._1470

class Solution {

    fun shuffle(nums: IntArray, n: Int): IntArray {
        var i = 0
        var j = n
        val res = IntArray(nums.size)
        var resIndex = 0

        while (j < nums.size) {
            res[resIndex++] = nums[i++]
            res[resIndex++] = nums[j++]
        }

        return res
    }
}