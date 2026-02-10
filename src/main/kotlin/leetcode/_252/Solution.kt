package leetcode._252

class Solution {

    fun canAttendMeetings(intervals: Array<IntArray>): Boolean {
        var mx = 0

        for (x in intervals) {
            if (x[1] > mx) {
                mx = x[1]
            }
        }

        val line = IntArray(mx + 1)

        for (x in intervals) {
            line[x[0]]++
            line[x[1]]--
        }

        for (i in line.indices) {
            if (i != 0) {
                line[i] += line[i - 1]
            }
            if (line[i] > 1) {
                return false
            }
        }

        return true
    }
}