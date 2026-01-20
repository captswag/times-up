package refresh._2224

class Solution {

    fun convertTime(current: String, correct: String): Int {
        var diff = convertTimeToMinutes(correct) - convertTimeToMinutes(current)

        var div = diff / 60
        diff %= 60

        div += (diff / 15)
        diff %= 15

        div += (diff / 5)
        diff %= 5

        div += diff

        return div
    }

    private fun convertTimeToMinutes(time: String): Int {
        return ((((time[0] - '0') * 10) + (time[1] - '0')) * 60) + (((time[3] - '0') * 10) + (time[4] - '0'))
    }
}