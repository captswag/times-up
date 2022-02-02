package leetcode._1184

class Solution {
    fun distanceBetweenBusStops(distance: IntArray, start: Int, destination: Int): Int {
        var sum1 = 0
        var sum2 = 0

        if (start < destination) {
            for (index in start until destination) {
                sum1 += distance[index]
            }

            for (index in start - 1 downTo 0) {
                sum2 += distance[index]
            }

            for (index in (distance.size - 1 downTo destination)) {
                sum2 += distance[index]
            }
        } else {
            for (index in start - 1 downTo destination) {
                sum1 += distance[index]
            }

            for (index in start until distance.size) {
                sum2 += distance[index]
            }

            for (index in 0 until destination) {
                sum2 += distance[index]
            }
        }
        return Math.min(sum1, sum2)
    }
}