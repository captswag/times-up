package refresh._1822

class Solution {

    fun arraySign(nums: IntArray): Int {
        var negativeCount = 0

        for (num in nums) {
            if (num == 0) {
                return 0
            } else if (num < 0) {
                negativeCount++
            }
        }

        return if (negativeCount and 1 == 0) {
            1
        } else {
            -1
        }
    }
}