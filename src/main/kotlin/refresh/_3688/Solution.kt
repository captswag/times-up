package refresh._3688

class Solution {

    fun evenNumberBitwiseORs(nums: IntArray): Int {
        var ans = 0

        for (num in nums) {
            if (num and 1 == 0) {
                ans = ans or num
            }
        }

        return ans
    }
}