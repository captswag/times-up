package refresh._268

class Solution {

    fun missingNumber(nums: IntArray): Int {
        var xorResult = 0

        for (index in nums.indices) {
            xorResult = xorResult xor nums[index] xor index
        }

        return xorResult xor nums.size
    }
}