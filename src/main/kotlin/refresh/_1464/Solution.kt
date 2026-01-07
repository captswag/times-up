package refresh._1464

class Solution {

    fun maxProduct(nums: IntArray): Int {
        var max = 0
        var secondMax = 0

        for (num in nums) {
            if (num > secondMax) {
                if (num > max) {
                    secondMax = max
                    max = num
                } else {
                    secondMax = num
                }
            }
        }

        return (max - 1) * (secondMax - 1)
    }
}