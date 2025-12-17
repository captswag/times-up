package refresh._1295

class Solution {

    fun findNumbers(nums: IntArray): Int {
        var evenDigitCount = 0

        for (num in nums) {
            when (num) {
                in 10..99, in 1000..9999, 100000 -> evenDigitCount++
            }
        }

        return evenDigitCount
    }
}