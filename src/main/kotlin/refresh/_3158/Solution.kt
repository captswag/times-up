package refresh._3158

class Solution {

    fun duplicateNumbersXOR(nums: IntArray): Int {
        val seen = BooleanArray(51)
        var xor = 0

        for (num in nums) {
            if (seen[num]) {
                xor = xor xor num
            } else {
                seen[num] = true
            }
        }

        return xor
    }
}