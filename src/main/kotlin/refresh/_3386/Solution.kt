package refresh._3386

class Solution {

    fun buttonWithLongestTime(events: Array<IntArray>): Int {
        var i = 0
        var mx = events[i][1]
        var ans = events[i][0]
        i++

        while (i < events.size) {
            val cur = events[i][1] - events[i - 1][1]
            if (cur > mx) {
                ans = events[i][0]
                mx = cur
            } else if (cur == mx && events[i][0] < ans) {
                ans = events[i][0]
            }
            i++
        }

        return ans
    }
}