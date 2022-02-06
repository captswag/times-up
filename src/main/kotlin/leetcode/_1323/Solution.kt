package leetcode._1323

class Solution {
    fun maximum69Number(num: Int): Int {
        var number = num
        var multiplier = 1

        for (index in 0 until getDigitCount(num) - 1) {
            multiplier *= 10
        }

        var found6 = false
        while (number > 0) {
            val div = number / multiplier
            number -= (9 * multiplier)
            if (div == 6) {
                found6 = true
                break
            }
            multiplier /= 10
        }

        return if (found6) {
            num + (3 * multiplier)
        } else {
            num
        }
    }

    private fun getDigitCount(num: Int): Int = when (num) {
        in 6..9 -> 1
        in 66..99 -> 2
        in 666..999 -> 3
        in 6666..9999 -> 4
        else -> 4 // Won't get to here due to the constraints
    }
}