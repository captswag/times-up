package leetcode._2409

class Solution {

    private val monthDayCountPrefixSum = intArrayOf(0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334)

    fun countDaysTogether(arriveAlice: String, leaveAlice: String, arriveBob: String, leaveBob: String): Int {
        val arriveAliceDayOfYear =
            convertToDayOfYear(arriveAlice.substring(0, 2).toInt() - 1, arriveAlice.substring(3, 5).toInt())
        val leaveAliceDayOfYear =
            convertToDayOfYear(leaveAlice.substring(0, 2).toInt() - 1, leaveAlice.substring(3, 5).toInt() + 1)
        val arriveBobDayOfYear =
            convertToDayOfYear(arriveBob.substring(0, 2).toInt() - 1, arriveBob.substring(3, 5).toInt())
        val leaveBobDayOfYear =
            convertToDayOfYear(leaveBob.substring(0, 2).toInt() - 1, leaveBob.substring(3, 5).toInt() + 1)

        val maxArrival = Math.max(arriveAliceDayOfYear, arriveBobDayOfYear)
        val minDeparture = Math.min(leaveAliceDayOfYear, leaveBobDayOfYear)

        val daysSpentTogether = minDeparture - maxArrival
        return if (daysSpentTogether < 0) {
            0
        } else {
            daysSpentTogether
        }
    }

    private fun convertToDayOfYear(month: Int, day: Int): Int {
        return monthDayCountPrefixSum[month] + day
    }
}