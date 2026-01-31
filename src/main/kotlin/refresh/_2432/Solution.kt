package refresh._2432

class Solution {

    fun hardestWorker(n: Int, logs: Array<IntArray>): Int {
        var i = 0
        var ans = logs[i][0]
        var mx = logs[i][1]
        i++

        while (i < logs.size) {
            val cur = logs[i][1] - logs[i - 1][1]
            if (cur == mx && logs[i][0] < ans) {
                ans = logs[i][0]
            } else if (cur > mx) {
                mx = cur
                ans = logs[i][0]
            }
            i++
        }

        return ans
    }
}