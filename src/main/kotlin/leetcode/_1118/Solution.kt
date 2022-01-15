package leetcode._1118

class Solution {
    fun numberOfDays(year: Int, month: Int): Int {
        return when (month) {
            1, 3, 5, 7, 8, 10, 12 -> 31
            4, 6, 9, 11 -> 30
            2 -> {
                if (isLeapYear(year)) {
                    29
                } else {
                    28
                }
            }
            else -> 31 // Default condition
        }
    }

    private fun isLeapYear(year: Int): Boolean {
        return if (year % 400 == 0) {
            true
        } else if (year % 100 == 0) {
            false
        } else year % 4 == 0
    }
}