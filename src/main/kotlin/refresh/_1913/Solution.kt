package refresh._1913

class Solution {

    fun maxProductDifference(nums: IntArray): Int {
        var max = 1
        var secondMax = 1
        var min = 10000
        var secondMin = 10000

        for (num in nums) {
            if (num > max) {
                secondMax = max
                max = num
            } else if (num > secondMax) {
                secondMax = num
            }

            if (num < min) {
                secondMin = min
                min = num
            } else if (num < secondMin) {
                secondMin = num
            }
        }

        return (max * secondMax) - (min * secondMin)
    }
}