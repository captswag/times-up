package refresh._3190

class Solution {

    fun minimumOperations(nums: IntArray): Int {
        var cnt = 0

        for (num in nums) {
            if (num % 3 != 0) {
                cnt++
            }
        }

        return cnt
    }
}