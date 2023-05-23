package leetcode._1185

class Solution {

    fun dayOfTheWeek(day: Int, month: Int, year: Int): String {
        val lastTwoDigitsOfTheYear = getLastTwoDigitsOfTheYear(year)
        var output = lastTwoDigitsOfTheYear / 4
        output += day
        output += getMonthKeyValue(month)
        if (isLeapYear(year)) {
            if (month == 1 || month == 2) {
                output -= 1
            }
        }
        output += getCenturyKeyPairValue(year)
        output += lastTwoDigitsOfTheYear
        output %= 7
        val dayOfTheWeekArray = arrayOf("Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
        return dayOfTheWeekArray[output]
    }

    private fun getLastTwoDigitsOfTheYear(year: Int): Int = year % 100

    private fun getMonthKeyValue(month: Int): Int {
        val monthKeyPairValue = intArrayOf(-1, 1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6)
        return monthKeyPairValue[month]
    }

    private fun isLeapYear(year: Int): Boolean {
        return if (year % 4 == 0) {
            year % 100 != 0 || year % 400 == 0
        } else {
            false
        }
    }

    private fun getCenturyKeyPairValue(year: Int): Int {
        return when (year) {
            in 1971..1999 -> 0
            in 2000..2099 -> 6
            else -> 4
        }
    }
}