package leetcode._1450

class Solution {
    fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
        var index = 0
        var output = 0

        while (index < startTime.size) {
            if (queryTime >= startTime[index] && queryTime <= endTime[index]) {
                output++
            }
            index++
        }

        return output
    }
}