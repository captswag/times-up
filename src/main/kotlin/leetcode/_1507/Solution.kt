package leetcode._1507

class Solution {
    fun reformatDate(date: String): String {
        val monthMap = mapOf(
            "Jan" to "01",
            "Feb" to "02",
            "Mar" to "03",
            "Apr" to "04",
            "May" to "05",
            "Jun" to "06",
            "Jul" to "07",
            "Aug" to "08",
            "Sep" to "09",
            "Oct" to "10",
            "Nov" to "11",
            "Dec" to "12"
        )

        var day = Character.getNumericValue(date[0])
        val month = StringBuilder()
        var year = 0
        var complete = 0
        var multiplier = 1000

        for (index in 1 until date.length) {
            if (complete == 0) {
                if (date[index].isDigit()) {
                    day = day * 10 + Character.getNumericValue(date[index])
                } else if (date[index] == ' ') {
                    complete++
                }
            } else if (complete == 1) {
                if (date[index].isLetter()) {
                    month.append(date[index])
                    if (month.length == 3) {
                        complete++
                    }
                }
            } else {
                if (date[index].isDigit()) {
                    year += (Character.getNumericValue(date[index]) * multiplier)
                    multiplier /= 10
                }
            }
        }
        return if (day < 10) {
            "$year-${monthMap.get(month.toString())}-0$day"
        } else {
            "$year-${monthMap.get(month.toString())}-$day"
        }
    }
}