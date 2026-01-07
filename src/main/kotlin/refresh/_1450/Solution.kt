package refresh._1450

class Solution {

    fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
        var index = 0
        var count = 0

        while (index < startTime.size) {
            if (startTime[index] <= queryTime && endTime[index] >= queryTime) {
                count++
            }
            index++
        }

        return count
    }
}