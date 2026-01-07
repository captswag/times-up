package refresh._1507

class Solution {

    fun reformatDate(date: String): String {
        val day = StringBuilder()
        var index = 0

        while (index < date.length && date[index].isDigit()) {
            day.append(date[index])
            index++
        }

        val month = StringBuilder()
        index = if (index == 1) {
            4
        } else {
            5
        }

        while (index < date.length && date[index] != ' ') {
            month.append(date[index])
            index++
        }

        val year = StringBuilder()
        index++

        while (index < date.length) {
            year.append(date[index])
            index++
        }

        val res = StringBuilder()
        res.append(year)
        res.append('-')

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
        res.append(monthMap.getValue(month.toString()))

        res.append('-')
        if (day.length == 1) {
            res.append('0')
        }
        res.append(day)
        return res.toString()
    }
}