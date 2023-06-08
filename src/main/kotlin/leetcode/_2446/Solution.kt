package leetcode._2446

class Solution {

    fun haveConflict(event1: Array<String>, event2: Array<String>): Boolean {
        val event1StartTimeInMinutes = convertToMinutes(event1[0])
        val event1EndTimeInMinutes = convertToMinutes(event1[1])
        val event2StartTimeInMinutes = convertToMinutes(event2[0])
        val event2EndTimeInMinutes = convertToMinutes(event2[1])
        val diff = Math.min(event1EndTimeInMinutes, event2EndTimeInMinutes) - Math.max(
            event1StartTimeInMinutes, event2StartTimeInMinutes
        )
        return diff >= 0
    }

    private fun convertToMinutes(time: String): Int {
        val hours = time.substring(0, 2).toInt()
        val minutes = time.substring(3, 5).toInt()
        return hours * 60 + minutes
    }
}