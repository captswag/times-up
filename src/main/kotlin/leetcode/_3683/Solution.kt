package leetcode._3683

class Solution {

    fun earliestTime(tasks: Array<IntArray>): Int {
        var output = tasks[0][0] + tasks[0][1]

        for (index in 1 until tasks.size) {
            output = Math.min(output, tasks[index][0] + tasks[index][1])
        }

        return output
    }
}