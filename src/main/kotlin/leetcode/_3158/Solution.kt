package leetcode._3158

class Solution {

    fun duplicateNumbersXOR(nums: IntArray): Int {
        val seen = BooleanArray(51)
        var output = 0

        for (num in nums) {
            if (seen[num]) {
                output = output xor num
            } else {
                seen[num] = true
            }
        }

        return output
    }
}