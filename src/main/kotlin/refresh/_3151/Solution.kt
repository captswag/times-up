package refresh._3151

class Solution {

    fun isArraySpecial(nums: IntArray): Boolean {
        var expected = invertParity(nums[0] and 1)

        for (index in 1 until nums.size) {
            val parity = nums[index] and 1
            if (parity == expected) {
                expected = invertParity(parity)
            } else {
                return false
            }
        }

        return true
    }

    private fun invertParity(currParity: Int): Int {
        return if (currParity == 0) {
            1
        } else {
            0
        }
    }
}