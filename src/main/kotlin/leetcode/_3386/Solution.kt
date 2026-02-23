package leetcode._3386

class Solution {

    fun buttonWithLongestTime(events: Array<IntArray>): Int {
        var i = 0
        var ans = events[i][0]
        var mx = events[i][1]
        i++

        while (i < events.size) {
            val t = events[i][1] - events[i - 1][1]
            if (t > mx) {
                ans = events[i][0]
                mx = t
            } else if (t == mx && events[i][0] < ans) {
                ans = events[i][0]
            }
            i++
        }

        return ans
    }
}