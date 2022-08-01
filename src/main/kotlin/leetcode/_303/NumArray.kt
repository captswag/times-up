package leetcode._303

class NumArray(nums: IntArray) {

    private var prefixSum = IntArray(nums.size)

    init {
        prefixSum[0] = nums[0]
        for (index in 1 until nums.size) {
            prefixSum[index] = nums[index] + prefixSum[index - 1]
        }
    }

    fun sumRange(left: Int, right: Int): Int {
        val leftPrefixValue = if (left == 0) {
            0
        } else {
            prefixSum[left - 1]
        }
        return prefixSum[right] - leftPrefixValue
    }

}