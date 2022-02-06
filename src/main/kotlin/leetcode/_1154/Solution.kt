package leetcode._1154

class Solution {
    fun dayOfYear(date: String): Int {
        var yearIteration = 0
        var year = 0

        var month = 0
        var monthTwoIteration = 0

        var day = 0

        var count = 0
        var multiplier = 1000

        for (c in date) {
            if (count == 0) {
                year += (Character.getNumericValue(c) * multiplier)
                multiplier /= 10
                yearIteration++
                if (yearIteration == 4) {
                    multiplier = 10
                    count++
                }
            } else if (count == 1) {
                if (c.isDigit()) {
                    month += (Character.getNumericValue(c) * multiplier)
                    multiplier /= 10
                    monthTwoIteration++
                    if (monthTwoIteration == 2) {
                        multiplier = 10
                        count++
                    }
                }
            } else {
                if (c.isDigit()) {
                    day += (Character.getNumericValue(c) * multiplier)
                    multiplier /= 10
                }
            }
        }

        // We got the year, month and day now
        val isLeapYear = isLeapYear(year)
        val daysInMonth = intArrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        if (isLeapYear) {
            daysInMonth[1] = 29
        }

        month--
        // Final step of the calculation

        var output = 0
        for (index in 0 until month) {
            output += daysInMonth[index]
        }
        output += day
        return output
    }

    private fun isLeapYear(year: Int) = if (year % 400 == 0) {
        true
    } else if (year % 100 == 0) {
        false
    } else year % 4 == 0
}