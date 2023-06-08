package leetcode._2432

class Solution {

    fun hardestWorker(n: Int, logs: Array<IntArray>): Int {
        var id = logs[0][0]
        var maxTimeTaken = logs[0][1]

        for (index in 1 until logs.size) {
            val currTimeTaken = logs[index][1] - logs[index - 1][1]
            if (currTimeTaken > maxTimeTaken) {
                maxTimeTaken = currTimeTaken
                id = logs[index][0]
            } else if (currTimeTaken == maxTimeTaken) {
                id = Math.min(id, logs[index][0])
            }
        }

        return id
    }
}