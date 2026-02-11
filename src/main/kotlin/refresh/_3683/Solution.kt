package refresh._3683

class Solution {

    fun earliestTime(tasks: Array<IntArray>): Int {
        var i = 0
        var mn = tasks[i][0] + tasks[i][1]
        i++

        while (i < tasks.size) {
            val cur = tasks[i][0] + tasks[i][1]
            if (cur < mn) {
                mn = cur
            }
            i++
        }

        return mn
    }
}